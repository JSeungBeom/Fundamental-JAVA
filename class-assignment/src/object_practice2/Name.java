package object_practice2;

public class Name {
	// Polymorphism(다형성)을 이용하여 Parameter로 Shape 타입의 객체 Rect, Circle에서 재정의 된 메소드 호출
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
