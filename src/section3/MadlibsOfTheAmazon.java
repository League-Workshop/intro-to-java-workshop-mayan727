package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String Adjective = JOptionPane.showInputDialog("enter adjective");

		// Get the user to enter a type of liquid
		String Liquid = JOptionPane.showInputDialog("enter type of Liquid");

		// Get the user to enter a body part
		String BodyPart = JOptionPane.showInputDialog("enter a body part");

		// Get the user to enter a verb
		String Verb= JOptionPane.showInputDialog("enter verb");

		// Get the user to enter a place
		String PLace= JOptionPane.showInputDialog("enter a place");

		// Fit the user's words into this sentence, and save it in a String:
		
		
		
		JOptionPane.showMessageDialog(null, " Piranhas are more" + Adjective+ "during the day, so cross the river at\n" + 
				"		 night. Piranhas are attracted to fresh" + Liquid + "and will most\n" + 
				"		 likely take a bite out of your" +BodyPart+ "if you" +Verb+  "Whatever\n" + 
				"		 you do, if you have an open wound, try to find another way to get\n" + 
				"		 back to the" +PLace+ " Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

