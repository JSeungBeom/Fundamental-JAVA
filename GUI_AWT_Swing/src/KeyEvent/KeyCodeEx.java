package KeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
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
			la.setText(e.getKeyText(e.getKeyCode())); // ���� Ű�� ���� Ű ���ڿ��� ���̺� ����
			Container contentPane = getContentPane();
			if(e.getKeyChar() == '%') { // ���� Ű�� �����ڵ� ���� %�� ���, �̴� getKeyCode()�δ� ���� �Ұ�
				contentPane.setBackground(Color.YELLOW);
			}
			else if(e.getKeyCode() == KeyEvent.VK_F1) { // ���� Ű�� ���� Ű ���� F1�� ���, getKeyChar()�� ����X
				contentPane.setBackground(Color.GREEN);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
