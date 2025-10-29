package PruebaLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class layout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton bj[][] = new JButton[3][3];
		JButton botonesPulsados[];
		int aux = 0;
		for (int i = 0; i < 9; i++) {
		}
		frame.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				frame.add(bj[i][j]);
			}
		}

	}
}
