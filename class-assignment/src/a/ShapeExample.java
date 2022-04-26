package a;

abstract class Shape{
	private int x;
	private int y;
	
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract void draw();
	abstract void calculateArea();
	void showPoint() {
		System.out.println("point: (" + x + ", " + y + ")");
	}
}

class Rect extends Shape{
	private int width;
	private int height;
	
	Rect(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	void draw() {
		System.out.println("Rect");
	}
	
	void calculateArea() {
		System.out.println("area: " + (width * height));
	}
}

class Circle extends Shape{
	private int radius;
	
	Circle(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	void draw() {
		System.out.println("Circle");
	}
	
	@Override
	void calculateArea() {
		System.out.println("area: " + (radius * radius * Math.PI));
	}
}



public class ShapeExample {
	public static void printInfor(Shape shape) {
		shape.draw();
		shape.showPoint();
		shape.calculateArea();
	}
	
	public static void main(String[] args) {
		Rect r = new Rect(1, 2, 3, 4);
		Circle c = new Circle(5, 6, 7);
		printInfor(r);
		printInfor(c);
	}
}
