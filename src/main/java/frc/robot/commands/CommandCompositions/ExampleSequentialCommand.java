package frc.robot.commands.CommandCompositions;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.ExampleCommands.ExampleCommand1;
import frc.robot.commands.ExampleCommands.ExampleCommand2;
import frc.robot.subsystems.ExampleSubsystem;

public class ExampleSequentialCommand extends SequentialCommandGroup  {
    public ExampleSequentialCommand(ExampleSubsystem exampleSubsystem) {
        System.out.println("Construct sequential command group");
        addCommands(
            new ExampleCommand1(exampleSubsystem),
            new ExampleCommand2(exampleSubsystem)
        );
    }
}
