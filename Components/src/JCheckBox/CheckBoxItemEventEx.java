package JCheckBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox fruits[] = new JCheckBox[3]; // 체크박스 배열
	private String names[]	 = {"사과", "배", "체리"}; // String 배열
	private JLabel sumLabel; // 레이블
	
	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener listener = new MyItemListener(); // ItemListener 객체 생성
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			// 각 체크박스에 동일한 아이템 리스너 추가, sum을 같은 객체에서 관리
			// new MyItemListener()와 같이 사용하였다면, sum을 각자 다른 객체에서 관리
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		private int sum = 0; // 가격의 합
		public void itemStateChanged(ItemEvent e) { // 체크박스의 선택/해제 상태가 변하는 경우
			if(e.getStateChange() == ItemEvent.SELECTED) { // 선택되었을 때
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			}
			else { // 해제되었을 때
				if(e.getItem() == fruits[0])
					sum -= 100;
				else if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}
			sumLabel.setText("현재" + sum + "원 입니다.");
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
