package sec07.exam04_other_contructor_call;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	// �ʵ�
	
	Car(){
		
	}
	
	Car(String model){
		this(model, null, 0);
	}
	// this() �޼ҵ�� Ŭ���� ���� �ٸ� �����ڸ� ȣ��
	Car(String model, String color){
		this(model, color, 0);
	}
	// this() �޼ҵ�� Ŭ���� ���� �ٸ� �����ڸ� ȣ��
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// ȣ��Ǵ� ������
}
