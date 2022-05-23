package KeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode())); // 누른 키의 가상 키 문자열로 레이블 수정
			Container contentPane = getContentPane();
			if(e.getKeyChar() == '%') { // 누른 키의 유니코드 값이 %인 경우, 이는 getKeyCode()로는 적용 불가
				contentPane.setBackground(Color.YELLOW);
			}
			else if(e.getKeyCode() == KeyEvent.VK_F1) { // 누른 키의 가상 키 값이 F1인 경우, getKeyChar()는 동작X
				contentPane.setBackground(Color.GREEN);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
