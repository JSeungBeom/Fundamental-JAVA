package JRadioButton;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryicon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryicon = new ImageIcon("images/selectedCherry.jpg");
		
		// 버튼 그룹에 라디오 버튼을 추가하여, 중복 선택이 불가능하도록 함
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryicon);
		cherry.setBorderPainted(true); // 경계선 설정
		cherry.setSelectedIcon(selectedCherryicon); // 라디오버튼이 선택되었을 때 나타낼 이미지
		
		// 버튼 그룹에 라디오버튼 추가
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
