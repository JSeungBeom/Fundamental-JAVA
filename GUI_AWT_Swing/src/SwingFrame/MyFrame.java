package SwingFrame;

import javax.swing.*;

// JFrame을 상속받아 MyFrame 구현
public class MyFrame extends JFrame {
	// 생성자
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
