package a;

class TV{
	private int size;
	
	TV(int size){
		this.size = size;
	}
	
	int getSize() {
		return size;
	}
	
	void printProperty() {
		System.out.println(getSize() + "��ġ");
	}
}

class ColorTV extends TV{
	private int color;
	
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	
	int getColor() {
		return color;
	}
	
	@Override
	void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�");
	}
}

class IPTV extends ColorTV{
	private String address;
	IPTV(String address, int size, int color){
		super(size, color);
		this.address = address;
	}
	
	@Override
	void printProperty() {
		System.out.println("���� IPTV�� " + address + " �ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");  
	}
}

public class TVexample {
	public static void main(String[] args) {
		TV myTV = new TV(24);
		myTV.printProperty();
		ColorTV myColorTV = new ColorTV(32, 1024);
		myColorTV.printProperty();
		IPTV myIPTV = new IPTV("192.1.1.2", 32, 2048);
		myIPTV.printProperty();
	}
}
