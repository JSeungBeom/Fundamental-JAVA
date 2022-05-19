package Event;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
	
	// 내부 클래스로 Action 이벤트 리스너 구현
	// 이벤트 리스너를 특정 클래스에서만 사용할 때 적합
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// 프레임 내의 멤버나 InnerClassListener의 멤버를 호출 가능
			InnerClassListener.this.setTitle(b.getText());
		}
	}

}
