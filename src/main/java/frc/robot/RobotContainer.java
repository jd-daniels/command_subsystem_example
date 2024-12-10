// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.CommandCompositions.ExampleSequentialCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Motors.MotorGroup;

public class RobotContainer {

  private ExampleSubsystem m_exampleSubsystem;
  private MotorGroup m_motorGroup;

  public RobotContainer() {
    m_exampleSubsystem = new ExampleSubsystem();
    m_motorGroup = new MotorGroup();
    configureBindings();
  }

  private void configureBindings() {
    System.out.println("Configure bindings in rc");
    OI.configureButtonBindings(m_motorGroup);
  }

  public void runExampleCommandGroup() {
    CommandScheduler.getInstance().schedule(new ExampleSequentialCommand(m_exampleSubsystem));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
