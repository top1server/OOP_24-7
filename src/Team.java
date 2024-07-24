

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;




public class Team {
    private String teamName;
    private List<String> teamMembers = new ArrayList<>();

    /**
     * this is empty constructor. 
     */
    public Team() {

    }

    /**
     * this is addMember method.
     * @param nameMember this is name member
     */
    public void addMember(String nameMember) {
        if (!teamMembers.contains(nameMember)) {
            teamMembers.add(nameMember);
        }
    }

    /**
     * this is removeMember method. 
     * @param nameMember this is name member
     */

    public void removeMember(String nameMember) {
        Iterator<String> iter = teamMembers.iterator();
        while(iter.hasNext()) {
            String temp = iter.next();
            if (temp.equals(nameMember)) {
                iter.remove();
            }
        }
    }

    /**
     * this is getTeamName method. 
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * this is setTeamName method.
     * @param teamName this is teamName.
     */

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * this is getTeamMember. 
     */
    public List<String> getTeamMember() {
        return this.teamMembers;
    }

    public void welcomeTeam() {
        
    }
}