package EventListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Anony extends JFrame {
	public Anony(){
		setTitle("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		// 익명 클래스 구현
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
					setTitle(b.getText());
			}
		});
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Anony();
	}

}
