package sec05.exam02_final_method;

public class Car {
	// �ʵ�
	public int speed;
	
	// �޼ҵ�
	public void speedUp() {
		speed += 1;
	}
	
	// final �޼ҵ�, �ڽ� Ŭ�������� ������ �� �� ���� �޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
} 
/*
final �ʵ� : ���� �Ұ� �ʵ�
final Ŭ���� : �θ�� ��� �Ұ��� Ŭ����
final �޼ҵ� : �ڽ��� �������� �� ���� �޼ҵ�
*/