package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		// Calculator 클래스의 myCalc 객체 생성
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // 메소드 호출 과정에서 byte 타입의 변수가 double 타입으로 형 변환
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}

}
