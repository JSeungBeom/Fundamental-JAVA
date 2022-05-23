package KeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
	private JLabel keyMessage[]; // JLable Ÿ���� �迭
	
	public KeyListenerEx(){
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// addKeyListener �޼ҵ�� KeyListener �̺�Ʈ �߰�
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i = 0; i < 3; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // ������Ʈ�� ������ �ٲٱ� ���� setOpaque(true)
			keyMessage[i].setBackground(Color.YELLOW); // ���� ����
		}
		
		setSize(300, 150);
		setVisible(true);
		
		// Ű �̺�Ʈ�� ���� �� �ִ� ����
		c.setFocusable(true); // ������Ʈ�� ��Ŀ���� ���� �� �ֵ��� ����
		c.requestFocus(); // ������Ʈ�� ��Ŀ�� ���� ����
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // �Էµ� Ű�� ���� Ű ���� ����(��� Ű�� ���� �۵�)
			char keyChar = e.getKeyChar(); // �Էµ� Ű�� �����ڵ� �� ����(���� Ű�� ��쿡�� �ڰ�)
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode)); // �Ű����� keyCode�� ���� Ű���� �ش��ϴ� ���ڿ� ����
		}
	}
	
	
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
