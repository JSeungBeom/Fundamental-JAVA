package StringBufferClass;

public class StringBufferEx {
	public static void main(String[] args) {
		// String Ŭ������ �޸� ���ڿ� ������ ����, String Ŭ������ ���� ������ ����ð��� ������
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); // ���ڿ� �����̱�
		System.out.println(sb);
		
		sb.insert(7, " my"); // "my" ���ڿ� ����
		System.out.println(sb);
		
		sb.replace(8,  10, "your"); // "my"�� "your"�� ����
		System.out.println(sb);
		
		// delete, replace �޼ҵ� �̿� ��, end index�� ���� end �ε����� �ִ� ������ �ڸ� ����Ų��.
		sb.delete(8, 13); // "your " ����
		System.out.println(sb);
		
		sb.setLength(4); // ��Ʈ�� ���� �� ���ڿ� ���� ����
		System.out.println(sb);
		
	}
}
