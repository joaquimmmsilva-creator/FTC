package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "teste")

public class codigo extends OpMode {


    private DcMotor motor1;

    @Override
    public void init() {

        motor1 = hardwareMap.get(DcMotor.class, "backleft");
    }

    @Override
    public void loop() {

        motor1.setPower(1);
    }
}

