package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***"); 
			// 몇 단인지 표기
			for(int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			} // 2단이라면, 2 x 1 ~ 2 x 9까지 출력
		} // 2중 for문을 이용한 구구단 출력
	}

}
