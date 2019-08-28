package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class houses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot luis = new Robot();
		luis.setSpeed(75);
		luis.setX(50);
		luis.setY(400);
		luis.penDown();
		luis.move(100);
		luis.turn(90);
		luis.move(50);
		luis.turn(90);
		luis.move(100);
		luis.turn(-90);
		luis.setPenColor(0, 144, 27);
		luis.move(50);

	}

}
