// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.CommandCompositions.ExampleSequentialCommand;
import frc.robot.subsystems.ExampleSubsystem;

public class RobotContainer {

  private ExampleSubsystem m_exampleSubsystem;

  public RobotContainer() {
    configureBindings();
    m_exampleSubsystem = new ExampleSubsystem();
  }

  private void configureBindings() {}

  public void runExampleCommandGroup() {
    CommandScheduler.getInstance().schedule(new ExampleSequentialCommand(m_exampleSubsystem));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
