package awt_swing;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("xx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("CANCEL"));
		contentPane.add(new JButton("IGNORE"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
