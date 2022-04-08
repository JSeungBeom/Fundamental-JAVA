package object_practice2;

// 추상 클래스 Shape, 추상 메소드가 있다면 반드시 클래스는 추상 클래스이어야만 한다
abstract class Shape {
	// 필드
	private int x;
	private int y;
	
	// 생성자
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// 메소드
	abstract void draw(); // 추상 메소드, Shape 클래스를 상속 받는 클래스에서 재정의를 하여 사용
	abstract void calculateArea(); // 추상 메소드, Shape 클래스를 상속 받는 클래스에서 재정의를 하여 사용
	void showPoint() {
		System.out.println("point: (" + x + ", " + y + ")");
	}
}
