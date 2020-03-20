package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("Input your birthday, mm/dd");
	if (birthday  .equals("03/19")) {
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!");
	}
		else {
			JOptionPane.showMessageDialog(null, "Today is not your birthday!");
		}
}
}
