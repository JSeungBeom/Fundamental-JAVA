package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); �߻� Ŭ���� Phone�� ��ü�� ������ �� ����.
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿"); // SmartPhone Ŭ������ ��ü ����
		
		smartPhone.turnOn(); // ���� Ŭ������ �޼ҵ� ȣ��
		smartPhone.internetSearch(); // SmartPhone Ŭ������ �޼ҵ� ȣ��
		smartPhone.turnOff();
	}

}