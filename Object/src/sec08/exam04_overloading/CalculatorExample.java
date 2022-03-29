package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); // 객체 생성
		
		double result1 = myCalc.areaRectangle(10); // 정사각형의 넓이
		
		double result2 = myCalc.areaRectangle(10, 20); // 직사각형의 넓이
		
		System.out.println("정사각형 넓이=" +  result1);
		System.out.println("직사각형 넓이=" + result2);
	}

}
