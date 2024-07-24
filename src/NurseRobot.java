public class NurseRobot extends Robot implements MedicalRobot {

    /**
     * constructor of robot
     *
     * @param robotName String name of robot
     * @param robotAge  int Age of robot
     * @param robotID   String ID of robot
     */
    public NurseRobot(String robotName, int robotAge, String robotID) {
        super(robotName, robotAge, robotID);
    }

    @Override
    public void robotCare() {
        System.out.println("__NURSE_ROBOT__ " + super.getRobotName()
                + super.getRobotID()
                + " is taking care for patients!");
    }

    @Override
    public void robotTasks() {
        System.out.println("__NURSE_ROBOT__ " + super.getRobotName()
                + super.getRobotID()
                + " is working!");
    }
}
