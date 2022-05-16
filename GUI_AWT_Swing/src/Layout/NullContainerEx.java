package Layout;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); // ��ġ �����ڰ� ���� �����̳�
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); // ���� ��ġ ����
		la.setSize(200, 20); // ���� ũ�� ����
		c.add(la);
		
		JLabel la2 = new JLabel("2nd label");
		la2.setLocation(200, 80);
		la2.setSize(60, 20);
		la2.setOpaque(true); // component�� �� ������ ���ؼ� �ʿ��� �޼ҵ� setOpaque(true)
		la2.setBackground(Color.YELLOW);
		// la2.setBackground(new Color(0xffd400)); 16���� ������ ���� ����
		// la2.setBackground(new Color(255, 255, 0)); R,G,B ������ ���� ����
		c.add(la2);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // ��ư ����
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b); // ��ư�� ����Ʈ�ҿ� ����
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
