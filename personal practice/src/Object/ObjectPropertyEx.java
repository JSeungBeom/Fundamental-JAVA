package Object;

// ��� Ŭ������ java.lang ��Ű���� Object Ŭ������ ��ӹ޴´�.
class Point{
	// �ʵ�
	private int x,y; 
	
	// ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { // Object�� toString �޼ҵ� ������
		return "Point(" + x + "," + y + ")";
	}
	
	// Object Ŭ������ equals �޼ҵ� : �⺻�����δ� == �� �����ϰ� ����
	// ������������, ���� ���� ��
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;
		}
		else
			return false;
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // Ŭ���� �̸�
		System.out.println(obj.hashCode()); // ��ü�� �ؽ� �ڵ� �� 
		System.out.println(obj.toString()); // ��ü�� ���ڿ��� ����  
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(obj); // toString()�� �ڵ����� ȣ��
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
		System.out.println(p.toString());
		System.out.println(p); // p�� p.toString()���� �ڵ� ��ȯ
		System.out.println(p + "�Դϴ�."); // p.toString() + "�Դϴ�"�� �ڵ� ��ȯ
	}
}
