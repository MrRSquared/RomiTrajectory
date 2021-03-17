# Romi Trajectory

## Description
This Repository is a modified version of the incredible work that @zhiquanyeo created to help us all learn how to use trajectories. Without him, we would be at a bit of a loss. You can access his repository [directly](https://github.com/bb-frc-workshops/romi-examples)

Note that all the constants used here assume that characterization has been done using meters as units. Additionally, all coordinates/distances are specified in meters.

## Additional Hardware Required
None

## Additional Configuration Required
- Ensure that the gyro has been [calibrated using the web UI](https://docs.wpilib.org/en/stable/docs/romi-robot/web-ui.html#imu-calibration)
- For best results, you should run a characterization on your Romi using the tool in [Zhiquanyeo's Git.](https://github.com/bb-frc-workshops/romi-examples/tree/main/romi-characterization) since there might be slight variations between Romis (due to assembly, mechanical difference, etc)
- We have created a few handy convenience features that allow you to easily imput and test waypoints.
    - [Add Waypoints](../Waypoints.java) Create a new list(or modify the existing one) of waypoints and starting and ending poses.
    - [Plot Trajectory Command](../commands/PlotTrajectory.java) While not needing much editing, this command allows you to visualize the trajectory using the Field2d() class. You can use it to fine-tune your wyapoints and starting and ending poses. It is set as an option for the Autonomous selcetor in [RobotContainer()](../src/java/frc/robot/RobotContainer()).
    

## Additional Code Setup
The trajectory can be modified by editing the `generateRamseteCommand` method in `RobotContainer.java`