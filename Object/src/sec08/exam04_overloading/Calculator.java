package sec08.exam04_overloading;

public class Calculator {
	double areaRectangle(double width) {
		return width * width;
	} 
	
	double areaRectangle(double width, double height) {
		return width * height;
	} // 메소드 오버로딩
	// 오버로딩 시에, 메소드의 리턴 타입은 무관하고 이름은 동일, parameter가 달라야 한다.
}
