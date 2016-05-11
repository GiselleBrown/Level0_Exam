/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color do you want your square to be, red or blue?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(color.equals("red")){
			Tortoise.setPenColor(Color.red);
		}else if(color.equals("blue")){
			Tortoise.setPenColor(Color.blue);
		}else{
			Tortoise.setPenColor(Color.BLACK);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
}



