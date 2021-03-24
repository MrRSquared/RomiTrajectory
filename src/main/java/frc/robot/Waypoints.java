// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import java.util.List;

import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.util.Units;

/** This is a PoJo for holding our waypoint lists. 
 * There must be a better way to organize this, but I have not figured it out yet :)
 */
public class Waypoints {
    public List<Translation2d> getPathAWaypoints(){
        List<Translation2d> aWaypoints = List.of(
            /**Put your Waypoints here. 
             * Units should be in Meters, but you can use the 
             * Units.inchesToMeters() method to convert them.
             */
            new Translation2d(Units.inchesToMeters(45), Units.inchesToMeters(10)),
            new Translation2d(Units.inchesToMeters(37.5), Units.inchesToMeters(22.5)),
            new Translation2d(Units.inchesToMeters(7.5), Units.inchesToMeters(20))
            //)
        );
        return aWaypoints;
    }
    public List <Pose2d> getPathAPoses(){
        /**TThis Method Contains the Poses.
         * The first one is the starting pose.
         * The second one is the ending pose.
         */
        List <Pose2d> aPoses = List.of(
            new Pose2d(Units.inchesToMeters(7.5), Units.inchesToMeters(7.5),new Rotation2d(0)),
            new Pose2d(Units.inchesToMeters(7.5), Units.inchesToMeters(7.5), new Rotation2d(0))
        );
        return aPoses;
    }
}
