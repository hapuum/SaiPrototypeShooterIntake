// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private final PWMVictorSPX heightMotor = new PWMVictorSPX(0);
  private final PWMVictorSPX FlywheelMotor = new PWMVictorSPX(1); 
  private boolean isIntaking = true;
  private boolean isElevating = true;
  public Shooter() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setHeightMotor(double power) {  
    heightMotor.set(power);
  };
  public void setFlywheelMotor(double power) {
    FlywheelMotor.set(power);
  }
  public void changeIntakeState() {
    isIntaking = !isIntaking;
  }
  public boolean getIntakeState() {
    return isIntaking;
  }
  public void changeElevatingState() {
    isElevating = !isElevating;
  }
  public boolean getElevatingState() {
    return isElevating;
  }

}
