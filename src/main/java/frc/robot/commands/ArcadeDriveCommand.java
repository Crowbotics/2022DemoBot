package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDriveCommand extends CommandBase{
    private final Drivetrain m_driveTrain;
    private final DoubleSupplier m_speed;
    private final DoubleSupplier m_rotation;
    
    public ArcadeDriveCommand(Drivetrain subsystem, DoubleSupplier speed, DoubleSupplier rotation) {
        m_driveTrain = subsystem;
        m_speed = speed;
        m_rotation = rotation;
        addRequirements(m_driveTrain);
    }

    @Override
    public void execute() {
        m_driveTrain.arcadeDrive(m_speed.getAsDouble(), m_rotation.getAsDouble());//getRawAxis() might be wrong
    }

}
