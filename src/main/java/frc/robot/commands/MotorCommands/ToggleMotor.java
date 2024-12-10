package frc.robot.commands.MotorCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Motors.MotorGroup;

/*
 * This command is used to toggle a motor off or on
 */
public class ToggleMotor extends Command {
    public ToggleMotor(MotorGroup m_motorGroup, int motorID) {

    }

    @Override
    public void initialize() {
        System.out.println("TOGGLED");
    }

    @Override
    public void execute() {
        
    }
  
    @Override
    public boolean isFinished() {
      return true;
    }
}
