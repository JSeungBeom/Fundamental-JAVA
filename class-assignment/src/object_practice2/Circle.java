package object_practice2;

// �߻� Ŭ���� Shape�� ��ӹ޴� Circle Ŭ����
class Circle extends Shape {
	// �ʵ�
	private int radius;
	
	// ������
	Circle(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
	// �߻� �޼ҵ带 ������
	@Override
	void draw() {
		System.out.println("Circle");
		showPoint();
		calculateArea();
	}
	
	@Override
	void calculateArea() {
		double area = radius * radius * Math.PI;
		System.out.println("area: " + area);
	}
}
