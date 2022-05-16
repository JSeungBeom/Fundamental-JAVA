package Layout;

import java.awt.*;
import javax.swing.*;

public class GridRandomColor extends JFrame {
	
	public GridRandomColor() {
		setTitle("GridLayout Example1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10)); // 1�� 10���� GridLayout���� ����
		
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 255 + 1); // rgb ���� r
			int g = (int)(Math.random() * 255 + 1); // rgb ���� g
			int b = (int)(Math.random() * 255 + 1); // rgb ���� b
			JButton j = new JButton(Integer.toString(i)); // ��ư ����
			j.setOpaque(true); // ������Ʈ�� ������ �����ϱ� ���� Opaque�� true�� ����
			j.setBackground(new Color(r, g, b)); // �������� rgb������ ������Ʈ�� ������ ����
			c.add(j); // �����̳ʿ� GridLayout�� ���� ��ư�� �߰�
		}
		
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridRandomColor();
	}

}
