package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {
	/* Your mission and you have to accept it:
	 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
	 * The main method should create a bag of Popcorn and cook it in the microwave.
	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	 * Don't change the existing methods.
	 */
	public static void main(String[] args) {
		Microwave micro = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		String cookTime = JOptionPane.showInputDialog("How long do you want to cook it?");
		int cookTimeInt = Integer.parseInt(cookTime);
		Popcorn pop = new Popcorn(flavor);
		micro.putInMicrowave(pop);
		micro.setTime(cookTimeInt);
		micro.startMicrowave();
		
	}
}
