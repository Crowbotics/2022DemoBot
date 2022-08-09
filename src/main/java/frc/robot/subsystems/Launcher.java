// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Launcher extends SubsystemBase {
  
  private VictorSP leftLauncherMotor = new VictorSP(Constants.leftLauncherPort);
  private VictorSP rightLauncherMotor = new VictorSP(Constants.rightLauncherPort);

  public Launcher() {
    rightLauncherMotor.setInverted(true);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void runLauncher()
  {
    leftLauncherMotor.set(Constants.LAUNCHER_SPEED);
    rightLauncherMotor.set(Constants.LAUNCHER_SPEED);
  }

  public void stopLauncher()
  {

    leftLauncherMotor.set(Constants.STOP);
    rightLauncherMotor.set(Constants.STOP);
  }

  public void reverseLauncher()
  {
    leftLauncherMotor.set(-Constants.LAUNCHER_SPEED / 2.0);
    rightLauncherMotor.set(-Constants.LAUNCHER_SPEED / 2.0);
  }
}
