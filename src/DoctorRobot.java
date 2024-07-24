public class DoctorRobot extends Robot implements MedicalRobot {

    /**
     * constructor of robot
     *
     * @param robotName String name of robot
     * @param robotAge  int Age of robot
     * @param robotID   String ID of robot
     */
    public DoctorRobot(String robotName, int robotAge, String robotID) {
        super(robotName, robotAge, robotID);
    }

    @Override
    public void robotCare() {
        System.out.println("__DOCTOR_ROBOT__ " + super.getRobotName()
                + super.getRobotID()
                + " is taking care for patients!");
    }

    @Override
    public void robotTasks() {
        System.out.println("__DOCTOR_ROBOT__ " + super.getRobotName()
                + super.getRobotID()
                + " is working!");
    }
}
