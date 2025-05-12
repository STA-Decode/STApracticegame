package org.firstinspires.ftc.teamcode.Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.RobotParts.driveTrain;


//the name is how this Opmode will show up on the driver-hub
@TeleOp(name = "Opmode", group = "TeleOp")
public class opmode extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    driveTrain driveTrain = new driveTrain();

    @Override
    public void runOpMode() throws InterruptedException {
        driveTrain.init(hardwareMap);

        waitForStart();
        if (isStopRequested()) return;

        while (opModeIsActive()) {
            //Well do something fun here, you will wanna read controller input, and use the methods made in the drivetrain
        }


    }
}