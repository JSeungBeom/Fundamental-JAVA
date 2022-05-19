package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Event.MouseListenerEx.MyMouseListener;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
	
	// 리스너 인터페이스의 경우, 추상 메소드를 모두 재정의해야함.
	// 어댑터 클래스는 리스너의 모든 메소드가 단순 리턴하도록 구현하여, 재정의하고 싶은 메소드만 재정의 가능
	// 클래스이므로, implements X , extends O
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

}
