package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	private static final Object YouWillRuleTheWorld = null;

	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog("DoYouKnowHowToWriteACode?");
		if(answer.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null,"You Will Rule The World");}
			 else{JOptionPane.showMessageDialog(null,"Good Luck Washing Dishes!");
		}
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

