package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by nihalmitta on 10/27/17.
 */

@TeleOp(name = "Autonomous Begin")
public class TeleOpStarter extends LinearOpMode{

    private DcMotor motorLeft;
    private DcMotor motorRight;

    @Override
    public void runOpMode() throws InterruptedException{

        motorLeft = hardwareMap.dcMotor.get("");
        motorRight = hardwareMap.dcMotor.get("");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()){

            motorLeft.setPower(-gamepad1.left_stick_y);
            motorRight.setPower(-gamepad1.right_stick_y);

            idle();
        }
    }

}
