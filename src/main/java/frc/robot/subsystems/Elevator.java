// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Elevator extends SubsystemBase {

  private VictorSP elevator = new VictorSP(Constants.elevatorPort);
  private VictorSP conveyor = new VictorSP(Constants.conveyorPort);
  
  /** Creates a new ExampleSubsystem. */
  public Elevator() {conveyor.setInverted(true);}

  public void moveCargoForward()
  {
    elevator.set(Constants.ELEVATOR_SPEED);
    conveyor.set(Constants.CONVEYOR_SPEED);
  }

  public void moveCargoBackward()
  {
    elevator.set(-Constants.ELEVATOR_SPEED);
    conveyor.set(-Constants.CONVEYOR_SPEED);
  }

  public void stop()
  {
    elevator.set(Constants.STOP);
    conveyor.set(Constants.STOP);
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
