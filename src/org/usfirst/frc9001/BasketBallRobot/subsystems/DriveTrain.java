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
import org.usfirst.frc9001.BasketBallRobot.commands.ManualDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class DriveTrain extends Subsystem {
	/*
    CanTalonSRX motorLeftA = RobotMap.driveTrainMotorLeftA;
    CanTalonSRX motorRightA = RobotMap.driveTrainMotorRightA;
    CanTalonSRX motorLeftB = RobotMap.driveTrainMotorLeftB;
    CanTalonSRX motorRightB = RobotMap.driveTrainMotorRightB;
    //*/
	//*
    CANTalon motorLeftA = RobotMap.driveTrainMotorLeftA;
    CANTalon motorRightA = RobotMap.driveTrainMotorRightA;
    CANTalon motorLeftB = RobotMap.driveTrainMotorLeftB;
    CANTalon motorRightB = RobotMap.driveTrainMotorRightB;
    //*/
	
	RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
	
	public void init() {
//		motorLeftB.SetModeSelect(CanTalonSRX.kMode_SlaveFollower);
//		motorRightB.SetModeSelect(CanTalonSRX.kMode_SlaveFollower);
		
		motorLeftB.changeControlMode(CANTalon.TalonControlMode.Follower);
		motorLeftB.set(motorLeftA.getDeviceID());
 
		motorRightB.changeControlMode(CANTalon.TalonControlMode.Follower);
		motorRightB.set(motorRightA.getDeviceID());
		
	}
    
    public void arcadeDrive(double forward, double rotate, boolean squaredInputs) {
    	robotDrive.arcadeDrive(forward, rotate, squaredInputs);
    }
    
    public void setLeftMotorSpeeds(double speed) {
    	motorLeftA.set(speed);
    	motorLeftB.set(speed);
    }
    
    public void setRightMotorSpeeds(double speed) {
    	motorRightA.set(speed);
    	motorRightB.set(speed);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ManualDrive());
    }

	public void logData() {
		SmartDashboard.putNumber("Left_Motor_A_Speed", motorLeftA.getSpeed());
		SmartDashboard.putNumber("Right_Motor_A_Speed", motorRightA.getSpeed());
	}

}

