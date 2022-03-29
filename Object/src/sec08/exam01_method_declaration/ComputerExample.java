package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer(); // 객체 생성

		int[] values1 = {1,2,3}; // 배열 생성
		int result1 = myCom.sum1(values1); // 배열을 인자로 넘겨준다
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); // 배열을 생성하여 인자로 넘겨준다
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3); // 수들을 인자로 넘겨준다
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5); // 수의 개수는 상관 없다
		System.out.println("result4: " + result4);
	}

}
