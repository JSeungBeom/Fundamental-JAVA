package object_practice2;

class TV {
	//필드
	private int size;
	
	// 생성자
	TV(int size){
		this.size = size;
	}
	
	// 메소드
	int getSize() {
		return size;
	}
	
	void printProperty() {
		System.out.println(size + "인치");
	}
}

// TV를 상속받는 ColorTV 클래스
class ColorTV extends TV{
	// 필드
	private int color;
	
	// 생성자
	ColorTV(int size, int color){
		super(size); // super 키워드로 슈퍼 클래스의 생성자 호출
		this.color = color;
	}
	
	// 메소드
	int getColor() {
		return color;
	}
	
	// 슈퍼 클래스의 printProperty() 메소드를 오버라이딩
	@Override
	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러"); // size는 private 필드이므로, getSize()를 통해 접근
	}
}

// ColorTV를 상속받는 IPTV
class IPTV extends ColorTV{
	// 필드
	private String address;
	
	// 생성자
	IPTV(String address, int size, int color){
		super(size, color); // super 키워드로 슈퍼 클래스의 생성자 호출
		this.address = address;
	}
	
	// 메소드
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 " + address + " 주소의 " +
	getSize() + "인치 " + getColor() + "컬러");
	}
}
public class TVExample {

	public static void main(String[] args) {
		TV myTV = new TV(24);
		myTV.printProperty();
		ColorTV myColorTV = new ColorTV(32, 1024);
		myColorTV.printProperty();
		IPTV myIPTV = new IPTV("192.1.1.2", 32, 2048);
		myIPTV.printProperty();
	}

}
