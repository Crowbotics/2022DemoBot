// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  
  
  public Drivetrain() {}

  private VictorSP leftDrive = new VictorSP(Constants.leftDrivePort);
  private VictorSP rightDrive = new VictorSP(Constants.rightDrivePort);
  private DifferentialDrive drive = new DifferentialDrive(leftDrive, rightDrive);
  
  public void arcadeDrive(Drivetrain drivetrain) {
  }

  public void arcadeDrive(double speed, double rotation)
  {
    drive.arcadeDrive(speed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
