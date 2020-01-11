/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
public class Robot extends TimedRobot {

  
  /**
 * This function is run when the robot is first started up and should be used
 * for any initialization code.
 */

 ColorSensorV3 sensor;

  @Override
  public void robotInit() {
    sensor  = new ColorSensorV3(Port.kOnboard);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  Color mDetectedColor;
  @Override
  public void teleopPeriodic() {
    mDetectedColor = sensor.getColor();



    SmartDashboard.putNumber("Red", mDetectedColor.red);
    SmartDashboard.putNumber("Green", mDetectedColor.green);
    SmartDashboard.putNumber("Blue", mDetectedColor.blue);
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
