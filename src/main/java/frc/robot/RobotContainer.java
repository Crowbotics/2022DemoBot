// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final GenericHID controller = new GenericHID(0);

  private final Intake m_intake = new Intake();
  private final Elevator m_elevator = new Elevator();
  private final Launcher m_launcher = new Launcher();

  private final Drivetrain m_drivetrain = new Drivetrain();

  Command m_autoCommand;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    
    m_drivetrain.setDefaultCommand(new ArcadeDriveCommand(m_drivetrain, () -> controller.getRawAxis(1), () -> controller.getRawAxis(4)));
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
    JoystickButton aButton = new JoystickButton(controller, 1);
    JoystickButton bButton = new JoystickButton(controller, 2);
    JoystickButton xButton = new JoystickButton(controller, 3);
    JoystickButton yButton = new JoystickButton(controller, 4);
    JoystickButton leftBumper = new JoystickButton(controller, 5);
    JoystickButton rightBumper = new JoystickButton(controller, 6);

    Button leftTrigger = new Button(() -> controller.getRawAxis(2) > 0.3);
    Button rightTrigger = new Button(() -> controller.getRawAxis(3) > 0.3);

    //aButton.whenHeld(new MoveCargoForward(m_elevator));
    bButton.whenHeld(new MoveCargoBackward(m_elevator));
    //xButton.whenHeld(new MoveCargoForward(m_elevator));
    //yButton.whenHeld(new MoveCargoBackward(m_elevator));

    leftBumper.whenHeld(new CollectCargo(m_intake));
    rightBumper.whenHeld(new ReleaseCargo(m_intake));

    leftTrigger.whenHeld(new LaunchCargo(m_launcher));
    rightTrigger.whenHeld(new MoveCargoForward(m_elevator));


    

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
