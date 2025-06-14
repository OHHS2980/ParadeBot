
import frc.robot.commands.DriveControl;

public class RobotContainer {
  private final Drive drive = new Drive();  

  private final CommandXboxController driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    // Configure the trigger bindings
    drive.setDefaultCommand(new DriveControl(drive.differentialDrive, () -> driverController.getLeftY(), () -> driverController.getRightX()));
  }
}