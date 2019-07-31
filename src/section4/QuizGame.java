package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String Answer= JOptionPane.showInputDialog("What is the date rome fell");
		
		// 3.  Use an if statement to check if their answer is correct
		if(Answer.equals("476")) {
			score+=1;
		}else{
			score+=0;
		}
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String Answer2= JOptionPane.showInputDialog("what is 5 x 12");
		if(Answer2.equals("60")) {
			score+=1;
		}else{
			score+=0;
		}
		
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "your score is" + score);
	}
}
	
	
