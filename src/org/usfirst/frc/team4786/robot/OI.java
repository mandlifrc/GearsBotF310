
package org.usfirst.frc.team4786.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4786.robot.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick joy = new Joystick(0);

    public OI() {
    	// Put Some buttons on the SmartDashboard
        SmartDashboard.putData("Elevator Bottom", new SetElevatorSetpoint(0));
        SmartDashboard.putData("Elevator Platform", new SetElevatorSetpoint(0.2));
        SmartDashboard.putData("Elevator Top", new SetElevatorSetpoint(0.3));
        
        SmartDashboard.putData("Wrist Horizontal", new SetWristSetpoint(0));
        SmartDashboard.putData("Raise Wrist", new SetWristSetpoint(-45));
        
        SmartDashboard.putData("Open Claw", new OpenClaw());
        SmartDashboard.putData("Close Claw", new CloseClaw());
        
        SmartDashboard.putData("Deliver Soda", new Autonomous());
        
        // Create some buttons
        JoystickButton y_btn = new JoystickButton(joy, 4);
        JoystickButton b_btn= new JoystickButton(joy, 2);
        JoystickButton a_btn= new JoystickButton(joy, 1);
        JoystickButton x_btn = new JoystickButton(joy, 3);
        
        JoystickButton left_ana_btn = new JoystickButton(joy, 9);
        JoystickButton right_ana_btn = new JoystickButton(joy, 10);
        
        JoystickButton lb_btn = new JoystickButton(joy, 5);
        JoystickButton rb_btn = new JoystickButton(joy, 6);

        // Connect the buttons to commands
        y_btn.whenPressed(new SetElevatorSetpoint(0.2));
        a_btn.whenPressed(new SetElevatorSetpoint(-0.2));
        b_btn.whenPressed(new CloseClaw());
        x_btn.whenPressed(new OpenClaw());
        
        lb_btn.whenPressed(new Place());
        rb_btn.whenPressed(new PrepareToPickup());
        
        left_ana_btn.whenPressed(new Autonomous());
        right_ana_btn.whenPressed(new Pickup());
    }
    
    public Joystick getJoystick() {
        return joy;
    }
}

