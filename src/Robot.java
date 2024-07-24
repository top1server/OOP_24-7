public abstract class Robot {
    protected String robotName;
    protected int robotAge;
    protected String robotID;

    /**
     * constructor of robot
     * @param robotName String name of robot
     * @param robotAge int Age of robot
     * @param robotID String ID of robot
     */
    public Robot(String robotName, int robotAge, String robotID) {
        this.robotName = robotName;
        this.robotAge = robotAge;
        this.robotID = robotID;
    }

    public String getRobotName() {
        return robotName;
    }

    public int getRobotAge() {
        return robotAge;
    }

    public String getRobotID() {
        return robotID;
    }

    //abstract method - tasks of robot
    public abstract void robotTasks();
}
