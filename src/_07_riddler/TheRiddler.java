package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null,"The score is "+ score);
		String guess = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		String answer = "a candle";
		// 4. If they got the answer right, pop up "correct!" and increase the score by on
		if (guess .contains("candle")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
			JOptionPane.showMessageDialog(null,score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null,"Your Wrong!");
			JOptionPane.showMessageDialog(null,score);
		}
		// 6. Add some more riddles
		String guess2 = JOptionPane.showInputDialog(null,"What has hands but can not clap?");
		String answer2 = "a clock";
		if (guess2 .contains("clock")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong!");
			JOptionPane.showMessageDialog(null,score);
		}

		// 2. Make a pop up to show the score.
		
	}
}

