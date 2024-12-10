package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.MotorCommands.ToggleMotor;
import frc.robot.subsystems.Motors.MotorGroup;

// Operator Interface
public class OI {
    private final static XboxController m_driverController = new XboxController(OIConstants.kDriverControllerPort);
    
    public OI () {

    }

    public static void configureButtonBindings(MotorGroup m_motorGroup) {
        new JoystickButton(m_driverController, Button.kX.value).whileTrue(new ToggleMotor(m_motorGroup, MotorConstants.kMotor0ID));
    }
}
