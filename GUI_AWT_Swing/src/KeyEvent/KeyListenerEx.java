package KeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
	private JLabel keyMessage[]; // JLable 타입의 배열
	
	public KeyListenerEx(){
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// addKeyListener 메소드로 KeyListener 이벤트 추가
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i = 0; i < 3; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 컴포넌트의 배경색을 바꾸기 위해 setOpaque(true)
			keyMessage[i].setBackground(Color.YELLOW); // 배경색 변경
		}
		
		setSize(300, 150);
		setVisible(true);
		
		// 키 이벤트를 받을 수 있는 조건
		c.setFocusable(true); // 컴포넌트가 포커스를 받을 수 있도록 설정
		c.requestFocus(); // 컴포넌트에 포커스 강제 지정
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 입력된 키의 가상 키 값을 리턴(모든 키에 대해 작동)
			char keyChar = e.getKeyChar(); // 입력된 키의 유니코드 값 리턴(문자 키인 경우에만 자곧ㅇ)
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode)); // 매개변수 keyCode의 가상 키값에 해당하는 문자열 리턴
		}
	}
	
	
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
