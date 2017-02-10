package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstProgram {
 public static void main(String[] args) {
	Robot echoRain=new Robot("batman");
echoRain.penDown();
echoRain.move(150);
echoRain.turn(30);
echoRain.move(-150);
echoRain.turn(30);
echoRain.move(150);
echoRain.turn(30);
 }

Robot echoRain=new Robot("batman");
echoRain.penDown();
echoRain.setSpeed(10);
for(int i=0;i<75;i++){
echoRain.setRandomPenColor();
echoRain.move(5*i);
echoRain.turn(360/3);
echoRain.side(7);}

