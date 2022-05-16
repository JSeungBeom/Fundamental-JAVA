package Layout;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// GridLayout : 컨테이너 공간을 격자로 분할하고 셀 당 하나의 컴포넌트 ㅂ치
		// GridLayout(int rows, int cols, int hGap, int vGap) 순서대로 행, 열, 수평간격, 수직간격 지정
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); // 수직 간격을 5픽셀로 설정
		
		Container c = getContentPane();
		c.setLayout(grid); // 4행 2열의 GridLayout 설정
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
