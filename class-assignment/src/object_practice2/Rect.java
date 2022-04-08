package object_practice2;

// 추상 클래스 Shape를 상속받는 Rect 클래스
class Rect extends Shape {
	// 필드
	private int width;
	private int height;
	
	// 생성자
	Rect(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// 추상 메소드를 자식 클래스에서 재정의
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
