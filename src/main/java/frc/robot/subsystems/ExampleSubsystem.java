package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
    
    // Constructor for this class
    public ExampleSubsystem() {
        System.out.println("Constructing an ExampleSubsystem");
    }

    public void doSomething() {
        System.out.println("I'm ExampleSubsystem1 and I'm doing something, yay");
    }

    // Inherited method that executes constantly
    @Override
    public void periodic() {

    }
}
