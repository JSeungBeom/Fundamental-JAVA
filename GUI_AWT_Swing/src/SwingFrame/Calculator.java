package SwingFrame;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	public Calculator() {
		setTitle("Calculator Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		Container input = new JPanel();
		input.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
		input.add(new JLabel("Enter formula"));
		input.add(new JTextField(10));
		input.setBackground(Color.GRAY);
		
		Container calc = new JPanel();
		calc.setLayout(new GridLayout(4, 4, 5, 5));
		for(int i = 0; i < 10; i++) {
			calc.add(new JButton(Integer.toString(i)));
		}
		calc.add(new JButton("CE"));
		calc.add(new JButton("RUN"));
		
		JButton j1 = new JButton("+");
		JButton j2 = new JButton("-");
		JButton j3 = new JButton("x");
		JButton j4 = new JButton("/");
		JButton j[] = new JButton[] {j1, j2, j3, j4};
		for(JButton elem : j) {
			elem.setOpaque(true);
			elem.setBackground(Color.CYAN);
			calc.add(elem);
		}
		
		
		Container result = new JPanel();
		result.setBackground(Color.YELLOW);
		result.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
		result.add(new JLabel("Result"));
		result.add(new JTextField(10));
		
		c.add(input, BorderLayout.NORTH);
		c.add(calc, BorderLayout.CENTER);
		c.add(result, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
