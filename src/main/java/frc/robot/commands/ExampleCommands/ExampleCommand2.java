package frc.robot.commands.ExampleCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ExampleSubsystem;

public class ExampleCommand2 extends Command {

    private ExampleSubsystem m_exampleSubsystem1;

    public ExampleCommand2(ExampleSubsystem exampleSubsystem1) {
      m_exampleSubsystem1 = exampleSubsystem1;
      addRequirements(m_exampleSubsystem1);
    }

    @Override
    public void initialize() {
      System.out.println("Example2 command init");
    }

    @Override
    public void execute() {
      m_exampleSubsystem1.doSomething();
      System.out.println("Example2 command is executing");
    }
  
    @Override
    public boolean isFinished() {
      System.out.println("Example2 command is finished");
      return true;
    }
}
