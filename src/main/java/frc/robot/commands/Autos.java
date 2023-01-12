// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  // Command used for auto is set at bottom of RobotContainer.java in getAutonomousCommand()

  public static CommandBase spinAuto(RomiDrivetrain m_drivetrain) {
    return Commands.repeatingSequence(
        new TurnToAngle(90, m_drivetrain), 
        new TurnToAngle(271, m_drivetrain));
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}