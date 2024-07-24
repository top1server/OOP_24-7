public class testMain {
    public static void main(String[] args) {
        Team t = new Team();
        t.setTeamName("team 3");
        t.addMember("Dung");
        t.addMember("DUc");
        t.welcomeTeam();
        Team t1 = new Team();
        t1.setTeamName("team 1");
        t1.addMember("a");
        t1.addMember("b");
        t1.welcomeTeam();
        TeamManagement manage = new TeamManagement();
        manage.addTeam(t);
        manage.addTeam(t1);
        
    }
}