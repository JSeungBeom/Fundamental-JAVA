
public class RectangleExample {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7); // ���簢�� ��ü r
		Rectangle s = new Rectangle(5, 5, 6); // ���簢�� ��ü s
		Rectangle t = new Rectangle(1, 1, 10); // ���簢�� ��ü t
		
		r.show(); // �簢�� r�� ���� ���
		System.out.println("s�� ������ " + s.square()); // �簢�� s�� ���� ���
		if(t.contains(r)) {
			System.out.println("t�� r�� �����մϴ�.");
		}
		if(t.contains(s)) {
			System.out.println("t�� s�� �����մϴ�.");
		}
	}

}
