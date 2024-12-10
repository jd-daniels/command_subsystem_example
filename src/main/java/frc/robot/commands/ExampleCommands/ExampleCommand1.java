package frc.robot.commands.ExampleCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ExampleSubsystem;

public class ExampleCommand1 extends Command {

    private ExampleSubsystem m_exampleSubsystem;

    public ExampleCommand1(ExampleSubsystem exampleSubsystem) {
        m_exampleSubsystem = exampleSubsystem;
        addRequirements(m_exampleSubsystem);
    }

    @Override
    public void initialize() {
      System.out.println("Example1 command init");
    }

    @Override
    public void execute() {
      System.out.println("Example1 command is executing");
    }
  
    @Override
    public boolean isFinished() {
      System.out.println("Example1 command is finished");
      return true;
    }
}
