package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
			Car myCar = new Car(); // default �����ڸ� ���� Car Ŭ������ myCar ��ü ����
			
			System.out.println("����ȸ�� : " + myCar.company);
			System.out.println("�𵨸� : " + myCar.model);
			System.out.println("���� : " + myCar.color);
			System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
			System.out.println("����ӵ� : " + myCar.speed);
			// Car Ŭ������ �����Ͽ�, �ʵ� ������ �д´�
			
			myCar.speed = 60; // �ʵ� ���� ����
			System.out.println("������ �ӵ� : " + myCar.speed);
	}

}
