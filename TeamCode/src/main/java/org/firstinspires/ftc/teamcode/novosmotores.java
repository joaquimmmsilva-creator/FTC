//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.CRServo;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.Servo;
//
//public class novosmotores extends OpMode {
//
//    DcMotorEx motorultra, motorHex;
//    Servo servo1;
//    CRServo servo2;
//
//
//@Override
//public void init() {
//    motorultra = hardwareMap.get(DcMotorEx.class, "motor");
//    motorHex = hardwareMap.get(DcMotorEx.class, "motor2");
//    servo1 = hardwareMap.get(Servo.class, "turretLeft");
//    servo2 = hardwareMap.get(CRServo.class, "motor2");
//
//
//
//}
//public void loop(){
//
//    if (gamepad1.y) {
//        motorultra.setPower(1.0);
//    } else {
//            motorultra.setPower(0);
//    }
//
//    if (gamepad1.b) {
//        motorHex.setPower(1.0);
//    } else {
//        motorHex.setPower(0);
//    }
//
//    if (gamepad1.a) {
//        servo1.setPosition(1.0);
//    } else {
//        servo1.setPosition(0);
//    }
//
//    if (gamepad1.x) {
//        servo2.setPower(1.0);
//    } else {
//        servo2.setPower(0);
//    }
//
//
//}
//public void start(){
//
//}
//
//}
//
