package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class Intake extends SubsystemBase {

  private VictorSP lowerIntakeMotor = new VictorSP(Constants.lowerIntakePort);
  private VictorSP upperIntakeMotor = new VictorSP(Constants.upperIntakePort);
  
  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void runIntakeForward()
  {
    lowerIntakeMotor.set(Constants.LOWER_INTAKE_SPEED);
    upperIntakeMotor.set(Constants.UPPER_INTAKE_SPEED);
  }

  public void runIntakeReverse()
  {
    lowerIntakeMotor.set(-Constants.LOWER_INTAKE_SPEED);
    upperIntakeMotor.set(-Constants.UPPER_INTAKE_SPEED);
  }

  public void stopIntake()
  {
    upperIntakeMotor.set(Constants.STOP);
    lowerIntakeMotor.set(Constants.STOP);
  }
}
