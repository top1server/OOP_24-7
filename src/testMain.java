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

        plantRobot farmbot = new plantRobot("Duc", 2, "123", "cay tung");
        Robot fishbot = new fishRobot("Dung", 5, "456", "give fish eating");
        farmbot.robotHarvest();
        manage.addRobotThroughTeam(t, farmbot);
        manage.addRobotThroughTeam(t, fishbot);

        for(Robot i : manage.getTeamRobots(t)) {
            System.out.println(i.getRobotName() + "   " + i.getRobotID() + "   ");
        }
        
    }
}