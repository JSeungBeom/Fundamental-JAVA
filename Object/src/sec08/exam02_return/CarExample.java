package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // ��ü ����
		
		myCar.setGas(5); // setGas �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); 
		} // gas�� 0�� �� ������ run
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
