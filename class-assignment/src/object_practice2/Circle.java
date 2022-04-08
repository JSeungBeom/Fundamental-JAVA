package object_practice2;

// 추상 클래스 Shape을 상속받는 Circle 클래스
class Circle extends Shape {
	// 필드
	private int radius;
	
	// 생성자
	Circle(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
	// 추상 메소드를 재정의
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
