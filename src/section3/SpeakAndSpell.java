package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("mississippi");

		// 2. Catch the user's answer in a String
		String Answer= JOptionPane.showInputDialog("spell the word");

		// 3. If the user spelled the word correctly, speak "correct"
		if(Answer.equals("mississippi")) {
		JOptionPane.showMessageDialog(null,"correct!");
		}else{
		JOptionPane.showMessageDialog(null,"WRONG");
		}
		
		

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


