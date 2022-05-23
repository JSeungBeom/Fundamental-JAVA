package KeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		// 한 클래스에 리스너를 모두 구현했더라도, 이벤트 추가는 따로 해줘야 동작
		c.addMouseListener(listener); 
		c.addMouseMotionListener(listener);
		
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// 인터페이스 마우스리스너와, 마우스모션리스너를 둘다 구현하는 구현 클래스
	class MyMouseListener implements MouseListener, MouseMotionListener{
		// MouseListener 메소드
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + ", " + e.getY() + ")") ;
		}
		
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + ", " + e.getY() + ")") ;
		}
		
		public void mouseClicked(MouseEvent e) {}
		
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		// MouseMotionListener 메소드
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + ", " + e.getY() + ")"); 
		}
		
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + ", " + e.getY() + ")"); 
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
