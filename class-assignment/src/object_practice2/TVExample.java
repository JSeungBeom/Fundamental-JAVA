package object_practice2;

class TV {
	//�ʵ�
	private int size;
	
	// ������
	TV(int size){
		this.size = size;
	}
	
	// �޼ҵ�
	int getSize() {
		return size;
	}
	
	void printProperty() {
		System.out.println(size + "��ġ");
	}
}

// TV�� ��ӹ޴� ColorTV Ŭ����
class ColorTV extends TV{
	// �ʵ�
	private int color;
	
	// ������
	ColorTV(int size, int color){
		super(size); // super Ű����� ���� Ŭ������ ������ ȣ��
		this.color = color;
	}
	
	// �޼ҵ�
	int getColor() {
		return color;
	}
	
	// ���� Ŭ������ printProperty() �޼ҵ带 �������̵�
	@Override
	void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�"); // size�� private �ʵ��̹Ƿ�, getSize()�� ���� ����
	}
}

// ColorTV�� ��ӹ޴� IPTV
class IPTV extends ColorTV{
	// �ʵ�
	private String address;
	
	// ������
	IPTV(String address, int size, int color){
		super(size, color); // super Ű����� ���� Ŭ������ ������ ȣ��
		this.address = address;
	}
	
	// �޼ҵ�
	@Override
	void printProperty() {
		System.out.println("���� IPTV�� " + address + " �ּ��� " +
	getSize() + "��ġ " + getColor() + "�÷�");
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
