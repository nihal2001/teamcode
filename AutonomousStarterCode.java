package org.firstinspires.ftc.robotcontroller.external.samples;

        import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.eventloop.opmode.Disabled;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorSimple;
        import com.qualcomm.robotcore.util.ElapsedTime;
        import com.qualcomm.robotcore.util.Range;
        import java.util.concurrent.SynchronousQueue;


@Autonomous(name="Basic Autonomous")

public class AutonomounStarterCode extends LinearOpMode {

    //declare hardware
    DcMotor motorLeft = null;
    DcMotor motorRight = null;

    public void runOpMode() throws InterruptedException {

        motorLeft = hardwareMap.dcMotor.("");
        motorRight = hardwareMap.dcMotor.("");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        //Initialize hardware above waitForStart()
        waitForStart();
        //Code you want to run goes above waitForStart()

        /**
         * The speed is a number between 0-1. 1 being the fastest and 0 being nothing. You can use decimals.
         * To go forward: moveForward(The speed);
         * To go backward: moveBackward(The speed);
         * To go diagonal: moveSide(The speed for the left motor, The speed for the right motor);
            ** To turn left make the left motor faster than the right motor
            ** To turn right make the right motor faster than the left motor
         * after putting one of the commands, type Thread.sleep(time in miliseconds); for how long the movement happens

         */
        //This is where you start your autonomous code

        /*
        //Goes forward full speed for 1 second
        moveForward(1);
        Thread.sleep(1000);
       //Goes Backward .8 of the full speed for 2 seconds
        moveBackward(0.8);
        Thread.sleep(2000);
       //Moves left for 1.5 seconds at approximately a 45 degree angle
        moveSide(1,.5);
        Thread.sleep(1500);
        */

        moveForward(1);
        Thread.sleep(1500);

         //This is Where You end your autonomous code
           stop();


    }

    public void moveForward(double pow) {
        motorLeft.setPower(pow);
        motorRight.setPower(pow);
    }

    public void moveBackward(double pow) {
        motorLeft.setPower(-pow);
        motorRight.setPower(-pow);
    }

    public void moveSide(double leftPow, double rightPow) {
        motorLeft.setPower(leftPow);
        motorRight.setPower(rightPow);
    }

    public void stop() {
        moveForward(0);
    }
}
