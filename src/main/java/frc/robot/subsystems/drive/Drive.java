// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

//also we dont need like most of these imports so if someone wants they can kill these!!! uwu
package frc.robot.subsystems;

import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix6.hardware.Pigeon2;
import com.pathplanner.lib.auto.AutoBuilder;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.Kinematics;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.SparkMax;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  public static WPI_TalonSRX RightSenpai = new SparkMax(Constants.rightSenpaiCanID);
  public static WPI_TalonSRX RightKohai = new SparkMax(Constants.rightKohaiCanID);
  public static WPI_TalonSRX LeftSenpai = new SparkMax(Constants.leftSenpaiCanID);
  public static WPI_TalonSRX LeftKohai = new SparkMax(Constants.leftKohaiCanID);

  private static DifferentialDrive differentialDrive = new DifferentialDrive(LeftSenpai, RightSenpai);

  public Drive() {
    RightKohai.follow(RightSenpai);
    LeftKohai.follow(LeftSenpai);
    LeftSenpai.setInverted(true);
    LeftKohai.setInverted(true);  
    }
}