package awt_swing;

import java.awt.*;
import javax.swing.*;

public class prob1 extends JFrame {
	public prob1() {
		setTitle("grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		JButton jbtn[] = new JButton[10];
		for(int i = 0; i < 10; i++) {
			jbtn[i] = new JButton(Integer.toString(i));
			jbtn[i].setOpaque(true);
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			jbtn[i].setBackground(new Color(r, g, b));
			c.add(jbtn[i]);
		}
		
		setSize(1000, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new prob1();
	}

}
