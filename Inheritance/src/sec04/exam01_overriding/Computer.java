package sec04.exam01_overriding;

// Calculator�� ��ӹ޴� Computer Ŭ����
public class Computer extends Calculator {
	// �޼ҵ�
	@Override // Override annotation : �����Ϸ����� �θ� Ŭ������ �޼ҵ� ����ο� ������ �� �˻�
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
