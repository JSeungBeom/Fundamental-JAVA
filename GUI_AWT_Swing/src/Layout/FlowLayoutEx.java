package Layout;

import javax.swing.*;
import java.awt.*;


public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// FlowLayout : 컨테이너 공간 내에 왼쪽 -> 오른쪽 배치
		// FlowLayout(정렬 방법, 수평 간격, 수직 간격)
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 왼쪽정렬, hGap 30, vGap 40
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
