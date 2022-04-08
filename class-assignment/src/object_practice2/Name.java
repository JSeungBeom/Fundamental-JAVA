package object_practice2;

public class Name {
	// Polymorphism(������)�� �̿��Ͽ� Parameter�� Shape Ÿ���� ��ü Rect, Circle���� ������ �� �޼ҵ� ȣ��
	public static void printInfor(Shape shape) {
		shape.draw();
	}
	public static void main(String[] args) {
		Rect r = new Rect(1, 2, 3, 4);
		Circle c = new Circle(5, 6, 7);
		printInfor(r);
		printInfor(c);
	}

}
