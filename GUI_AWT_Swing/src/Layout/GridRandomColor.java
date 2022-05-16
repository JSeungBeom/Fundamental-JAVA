package Layout;

import java.awt.*;
import javax.swing.*;

public class GridRandomColor extends JFrame {
	
	public GridRandomColor() {
		setTitle("GridLayout Example1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10)); // 1행 10열의 GridLayout으로 지정
		
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 255 + 1); // rgb 값의 r
			int g = (int)(Math.random() * 255 + 1); // rgb 값의 g
			int b = (int)(Math.random() * 255 + 1); // rgb 값의 b
			JButton j = new JButton(Integer.toString(i)); // 버튼 생성
			j.setOpaque(true); // 컴포넌트의 배경색을 지정하기 위해 Opaque를 true로 지정
			j.setBackground(new Color(r, g, b)); // 무작위의 rgb값으로 컴포넌트의 배경색을 지정
			c.add(j); // 컨테이너에 GridLayout에 따라 버튼을 추가
		}
		
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridRandomColor();
	}

}
