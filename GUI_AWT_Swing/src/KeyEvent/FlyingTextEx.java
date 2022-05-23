package KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame {
	private JLabel la = new JLabel("HELLO");
	private final int FLYING_UNIT = 10;
	public FlyingTextEx() {
		setTitle("상,하,좌,우키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 텍스트를 움직이기 위해, 레이아웃 관리자를 null로 함
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		// 익명 클래스로 MouseAdapter를 MouseListener 이벤트에 추가
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			// l ㅡ > x 값
			// V 
			// y 값
			if(keyCode == KeyEvent.VK_UP) {
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
			}
			else if(keyCode == KeyEvent.VK_DOWN) {
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
			}
			else if(keyCode == KeyEvent.VK_LEFT) {
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
			}
			else if(keyCode == KeyEvent.VK_RIGHT) {
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
