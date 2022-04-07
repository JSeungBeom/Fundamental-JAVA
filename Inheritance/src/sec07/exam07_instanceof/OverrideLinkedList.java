package sec07.exam07_instanceof;

class Shape{ // ���� Ŭ����
	// �ʵ�
	public Shape next;
	// ������
	public Shape() {
		next = null;
	}
	// �޼ҵ�
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class OverrideLinkedList {

	public static void main(String[] args) {
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		Shape start, last, obj;
		
		start = new Line(); // Line ��ü ����
		last = start;
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

}
