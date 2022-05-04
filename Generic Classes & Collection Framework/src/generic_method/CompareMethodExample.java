package generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		// ���׸� Ÿ���� Ÿ�� �Ķ���͸� ���� Integer�� String���� �ϴ� ��ü ����
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		// Pair<Integer, String> p3 = new Pair<>(1, "���");
		
		// ���׸� Ÿ�� ��ü���� �ʵ���� ���ϴ� Util Ŭ������ ���׸� �޼ҵ� ȣ��
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
		
		// ���׸� Ÿ���� Ÿ�� �Ķ���͸� String, String���� �ϴ� ��ü ����
		Pair<String, String> p3 = new Pair<String, String>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2", "ȫ�浿");
		
		boolean result2 = Util.compare(p3, p4); // ���׸� �޼ҵ� ȣ��
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
	}

}
