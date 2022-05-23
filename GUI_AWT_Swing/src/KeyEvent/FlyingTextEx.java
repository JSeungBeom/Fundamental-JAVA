package KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame {
	private JLabel la = new JLabel("HELLO");
	private final int FLYING_UNIT = 10;
	public FlyingTextEx() {
		setTitle("��,��,��,��Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // �ؽ�Ʈ�� �����̱� ����, ���̾ƿ� �����ڸ� null�� ��
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		// �͸� Ŭ������ MouseAdapter�� MouseListener �̺�Ʈ�� �߰�
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
			
			// l �� > x ��
			// V 
			// y ��
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
