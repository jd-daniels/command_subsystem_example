package frc.robot.subsystems.Motors;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Motor {
    private CANSparkMax m_sparkmax;

    public Motor(int deviceID) {
        m_sparkmax = new CANSparkMax(deviceID, MotorType.kBrushless);
    }
}
