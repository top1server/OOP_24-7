
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class TeamManagement {
    private HashMap<Team, List<Robot>> listTeam = new HashMap<>();

    public void addTeam(Team team) {
        listTeam.put(team, new ArrayList<>());
    }

    public void removeTeam(Team team) {
        listTeam.remove(team);
    }

    public void addRobotThroughTeam(Team team, Robot robot) {
        listTeam.get(team).add(robot);
    }

    public void removeRobotThroughTeam(Team team, Robot robot) {
        listTeam.get(team).remove(robot);
    }

    public List<Robot> getTeamRobots(Team team) {
        return listTeam.get(team);
    }
}
