package frc.robot.subsystems.Motors;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/* 
* A MotorGroup is a aggregation of all motors on the prototype board.
* It is the subsystem containing all motors
*/
public class MotorGroup extends SubsystemBase {
    private Motor m_motor0;
    private Motor m_motor1;
    private Motor m_motor2;
    private Motor m_motor3;

    // Initialize the group and construct all motors
    public MotorGroup() {

    }

    @Override
    public void periodic() {

    }
}
