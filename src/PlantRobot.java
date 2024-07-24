public class PlantRobot extends Robot implements FarmingRobot {
    private String plantTree;

    
    public plantRobot(String robotName, int robotAge, String robotID, String plantTree) {
        super(robotName, robotAge, robotID);
        this.plantTree = plantTree;
    }

    @Override
    public void robotHarvest() {
        System.out.println("Robot " + super.getRobotName() + " with id: " + super.getRobotID() + " is doing: " + this.plantTree);
        
    }

    @Override
    public void robotProcess() {
        System.out.println("Robot " + super.getRobotName() + " with id: " + super.getRobotID() + " is processing...");
    }

    @Override
    public void robotTasks() {
        System.out.println("Plant tree stuff");
    }
    
}
