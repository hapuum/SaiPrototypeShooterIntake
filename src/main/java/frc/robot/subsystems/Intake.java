// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private final PWMVictorSPX bottomMotor = new PWMVictorSPX(2);
  private final PWMVictorSPX topMotor = new PWMVictorSPX(3);
  public Intake() {
  }

  public void activate() {
    bottomMotor.set(-0.5);
    topMotor.set(0.5);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
