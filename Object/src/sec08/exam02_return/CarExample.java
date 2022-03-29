package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 객체 생성
		
		myCar.setGas(5); // setGas 메소드 호출
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); 
		} // gas가 0이 될 때까지 run
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
