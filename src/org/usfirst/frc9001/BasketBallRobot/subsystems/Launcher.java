// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc9001.BasketBallRobot.subsystems;

import org.usfirst.frc9001.BasketBallRobot.RobotMap;
import org.usfirst.frc9001.BasketBallRobot.commands.ManualLauncher;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Launcher extends Subsystem {
    CANTalon motorLauncher = RobotMap.launcherMotorLauncher;
    CANTalon motorLoader = RobotMap.launcherMotorLoader;

    public void init() {
    	motorLauncher.setFeedbackDevice(FeedbackDevice.EncRising);
    }
    
    public void setLauncherSpeed(double speed) {
    	motorLauncher.set(speed);
    }
    
    public void setLoaderSpeed(double speed) {
    	motorLoader.set(speed);
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new ManualLauncher());
    }

	public void logData() {
		SmartDashboard.putNumber("Launcher_Motor_Speed", motorLauncher.getSpeed());
		SmartDashboard.putNumber("Loader_Motor_Speed", motorLauncher.getSpeed());
	}
}
