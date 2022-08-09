// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final int leftDrivePort = 0;
    public static final int rightDrivePort = 1;
    public static final int leftLauncherPort = 2;
    public static final int rightLauncherPort = 3;
    public static final int conveyorPort = 4;
    public static final int elevatorPort = 5;
    //6 unused
    //7 unused
    public static final int lowerIntakePort = 8;
    public static final int upperIntakePort = 9;


    //Speeds
    public static final double STOP = 0.0;
    public static final double LAUNCHER_SPEED = 1.0;
    public static final double ELEVATOR_SPEED = 0.8;
    public static final double CONVEYOR_SPEED = 0.8;
    public static final double UPPER_INTAKE_SPEED = 0.8;
    public static final double LOWER_INTAKE_SPEED = 0.8;



}
