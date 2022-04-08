package object_practice2;

// �߻� Ŭ���� Shape�� ��ӹ޴� Rect Ŭ����
class Rect extends Shape {
	// �ʵ�
	private int width;
	private int height;
	
	// ������
	Rect(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// �߻� �޼ҵ带 �ڽ� Ŭ�������� ������
	@Override
	void draw() {
		System.out.println("Rect");
		showPoint();
		calculateArea();
	}
	
	@Override
	void calculateArea() {
		int area = width * height;
		System.out.println("area: " + area);
	}
}
