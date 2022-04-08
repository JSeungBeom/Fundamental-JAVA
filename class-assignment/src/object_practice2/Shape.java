package object_practice2;

// �߻� Ŭ���� Shape, �߻� �޼ҵ尡 �ִٸ� �ݵ�� Ŭ������ �߻� Ŭ�����̾�߸� �Ѵ�
abstract class Shape {
	// �ʵ�
	private int x;
	private int y;
	
	// ������
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// �޼ҵ�
	abstract void draw(); // �߻� �޼ҵ�, Shape Ŭ������ ��� �޴� Ŭ�������� �����Ǹ� �Ͽ� ���
	abstract void calculateArea(); // �߻� �޼ҵ�, Shape Ŭ������ ��� �޴� Ŭ�������� �����Ǹ� �Ͽ� ���
	void showPoint() {
		System.out.println("point: (" + x + ", " + y + ")");
	}
}
