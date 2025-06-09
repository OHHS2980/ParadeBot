package edu.wpi.first.wpilibj.examples.hatchbottraditional.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Constants;

import edu.wpi.first.wpilibj.examples.hatchbottraditional.subsystems.DriveSubsystem;

/**
 * A command to drive the robot with joystick input (passed in as {@link DoubleSupplier}s). Written
 * explicitly for pedagogical purposes - actual code should inline a command this simple with {@link
 * edu.wpi.first.wpilibj2.command.RunCommand}.
 */
public class DefaultDrive extends CommandBase {
  private final DriveSubsystem drive;
  private final DoubleSupplier forward;
  private final DoubleSupplier rotation;

  // Creates a new DefaultDrive with suppliers 
  //subsystem is Drive differentialDrive btw
  public DefaultDrive(Drive subsystem, DoubleSupplier forward, DoubleSupplier rotation) {
    this.drive = subsystem;
    this.forward = forward;
    this.rotation = rotation;
  }

  @Override
  public void execute() {
    drive.arcadeDrive(forward.getAsDouble() * Constants.speed, rotation.getAsDouble() * Constants.speed);
  }
}