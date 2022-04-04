package sec04.exam02_super;

// Airplane�� �θ� Ŭ������ ��� �޴� �ڽ� Ŭ����
public class SupersonicAirplane extends Airplane {
	// �ʵ�
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; // static final Ÿ���� ��� �ʵ�
	
	public int flyMode = NORMAL;
	
	@Override // �θ� Ŭ�����κ��� ������(Override)�Ǵ� �޼ҵ�
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}
		else {
			// Airplane(�θ� Ŭ����) ��ü�� fly() �޼ҵ� ȣ�� super.method()
			super.fly();
		}
	}
}
