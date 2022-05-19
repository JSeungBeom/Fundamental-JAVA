package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Event.MouseListenerEx.MyMouseListener;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	public MouseAdapterEx() {
		setTitle("Mouse �̺�Ʈ ����");
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
	
	// ������ �������̽��� ���, �߻� �޼ҵ带 ��� �������ؾ���.
	// ����� Ŭ������ �������� ��� �޼ҵ尡 �ܼ� �����ϵ��� �����Ͽ�, �������ϰ� ���� �޼ҵ常 ������ ����
	// Ŭ�����̹Ƿ�, implements X , extends O
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

}
