package ObjectClass;

// Object Ŭ������ ���� ���(Object Ŭ������ ��� Ŭ������ ���� Ŭ����, java.lang ��Ű���� ����)
class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Object Ŭ������ toString() �޼ҵ� �������̵�
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}
public class ObjectPropertyEx {
	// main �Լ��� �ִ� Ŭ������ �޼ҵ�� ��� public static Ÿ���̾��
	// main �Լ����� ��ü ���� ����, �ٷ� ����� ���� (main �Լ��� Ư��)
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // Ŭ���� �̸� 
		System.out.println(obj.hashCode()); // �ؽ��ڵ� ��
		System.out.println(obj.toString()); // ��ü�� ���ڿ��� ����� ���
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p); // p�� p.toString()���� �ڵ� ��ȯ
		System.out.println(p + "�Դϴ�."); // p.toString() + "�Դϴ�."�� �ڵ���ȯ
		System.out.println();
		print(p); // print �޼ҵ� ȣ��
		System.out.println();
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b) // ���� �ٸ� ��ü�� �����ϹǷ� false
			System.out.println("a == b");
		if(a.equals(b)) // ���� �ʵ�, x, y�� �����ϹǷ� true
			System.out.println("a is equal to b");
		if(a.equals(c)) // ���� �ʵ�, x, y�� �ٸ��Ƿ� false
			System.out.println("a is equal to c");
	}
}
