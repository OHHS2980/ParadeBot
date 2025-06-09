// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  private final RobotContainer m_robotContainer;

  //initialization
  public Robot() {
    // robot container sets the command and creates any future subsytems
    m_robotContainer = new RobotContainer();
  }

  //This function is called every 20 ms
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler. 
    CommandScheduler.getInstance().run();
  }
}