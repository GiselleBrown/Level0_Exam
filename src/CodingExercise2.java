
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they were born. If they are over 30, tell them
 * they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		
	
	String number = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(number);
	String a = JOptionPane.showInputDialog("Have you had your birthday this year?");
	if(a.equals("yes")){
		int year = 2016-age;
	JOptionPane.showMessageDialog(null, "You were born in " + year + ".");

	}else if(a.equals("no")){
		int year = 2015-age;
		JOptionPane.showMessageDialog(null, "You were born in " + year + ".");
	}
	
	if(age>30){
		JOptionPane.showMessageDialog(null, "You are to old to play this game.");
	}
}
}
