package JButton;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalicon = new ImageIcon("images/normalicon.gif");
		ImageIcon rollovericon = new ImageIcon("images/rollovericon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedicon.gif");
		
		JButton btn = new JButton("call~~", normalicon); // 문자열과 이미지를 갖는 버튼
		btn.setPressedIcon(pressedIcon); // 버튼을 누르는 동안 이미지를 출력하는 버튼의 메소드
		btn.setRolloverIcon(rollovericon); // 버튼에 마우스가 올라갈 때 이미지를 출력하는 버튼의 메소드
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonEx();
	}
}
