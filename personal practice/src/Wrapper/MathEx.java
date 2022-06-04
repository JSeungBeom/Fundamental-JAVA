package Wrapper;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("이번주 행운의 번호는 ");
		for(int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 45 + 1) + " ");
			// Math.random()은 0 ~ 1 미만의 실수 발생
		}
	}
}
