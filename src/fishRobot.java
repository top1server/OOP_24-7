public class fishRobot extends Robot implements FarmingRobot {
    private String farm;
    public fishRobot(String robotName, int robotAge, String robotID, String farm) {
        super(robotName, robotAge, robotID);
        this.farm = farm;
    }

    @Override
    public void robotHarvest() {
        System.out.println("Robot " + super.getRobotName() + " with id: " + super.getRobotID() + " is a fish raise robot and he is doing: " + this.farm);
    }

    @Override
    public void robotProcess() {
        System.out.println("Robot " + super.getRobotName() + " with id: " + super.getRobotID() + " is a fish raise robot and he is processing");
    }

    @Override
    public void robotTasks() {
        System.out.println("Robot: " + super.getRobotName() + " is doing raise fish");
    }
    
}
