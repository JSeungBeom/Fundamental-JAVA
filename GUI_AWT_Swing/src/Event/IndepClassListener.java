package Event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
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
		new IndepClassListener();
	}

}

// 독립 클래스로 이벤트 리스너 작성
// 재사용의 측면에서 유용하지만, 프레임 내의 멤버에 접근할 수 없음
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); // 이벤트를 호출한 객체 알아내기
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
