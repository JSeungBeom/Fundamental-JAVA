package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		// interface 타입의 익명 객체를 생성
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				 	setTitle(b.getText());
			}
		}); // 익명 객체를 생성할 때, 뒤에 반드시 세미 콜론을 붙여야 함
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
