
public class Rectangle {
	int xpos;
	int ypos;
	int width;
	int height;
	// 필드 
	
	Rectangle(int xpos, int ypos, int width, int height){
		this.xpos = xpos;
		this.ypos = ypos;
		this.width = width;
		this.height = height;
	} // 생성자, 직사각형
	
	Rectangle(int xpos, int ypos, int width){
		this(xpos, ypos, width, width);
	} // this()를 이용한 생성자 오버로딩, 정사각형
	
	void show() {
		System.out.println("(" + xpos + "," + ypos + ")에서 크기가 " + width + "x" + height + "인 사각형");
	} // 사각형의 x, y 좌표와 width, height 출력 메소드
	
	int square() {
		return width * height;
	} // 사각형의 넓이 계산 메소드
	
	boolean contains(Rectangle r) {
		if(xpos < r.xpos && ypos < r.ypos && 
				xpos + width > r.xpos + r.width && ypos + height > r.ypos + r.height) {
			return true;
		} // x,y 좌표(bottom left)가 사각형 r보다 작고, x + width, y + height(top right)가 사각형 r보다 크다면
		// 포함 관계이므로 true 리턴
		else {
			return false;
		} // 포함하지 않는 경우 false 리턴
	} // 한 사각형이 다른 사각형을 포함하고 있는지 판단하는 메소드
}
