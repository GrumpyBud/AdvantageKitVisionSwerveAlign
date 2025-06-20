// Copyright (c) 2025 FRC 1466
// http://github.com/FRC1466
//
// Use of this source code is governed by an MIT-style
// license that can be found in the LICENSE file at
// the root directory of this project.

package frc.robot.subsystems.superstructure.manipulator;

import edu.wpi.first.math.geometry.Rotation2d;
import org.littletonrobotics.junction.AutoLog;

public interface PivotIO {
  @AutoLog
  class PivotIOInputs {
    public PivotIOData data =
        new PivotIOData(false, false, Rotation2d.kZero, Rotation2d.kZero, 0, 0, 0, 0, 0);
  }

  record PivotIOData(
      boolean motorConnected,
      boolean encoderConnected,
      Rotation2d internalPosition,
      Rotation2d encoderAbsolutePosition,
      double velocityRadPerSec,
      double appliedVolts,
      double supplyCurrentAmps,
      double torqueCurrentAmps,
      double tempCelsius) {}

  default void updateInputs(PivotIOInputs inputs) {}

  default void runOpenLoop(double output) {}

  default void runVolts(double volts) {}

  default void stop() {}

  default void runPosition(Rotation2d position, double feedforward) {}

  default void setPID(double kP, double kI, double kD) {}

  default void setBrakeMode(boolean enabled) {}
}
