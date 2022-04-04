package sec04.exam01_overriding;


public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator(); // 객체 생성
		// 부모 클래스에서 정의된 메소드
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		Computer computer = new Computer();
		// 자식 클래스에서 재정의(Override)된 메소드
		System.out.println("원 면적 : " + computer.areaCircle(r));
		
	}

}
