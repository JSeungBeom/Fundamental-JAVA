package WrapperClass;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); // 'A'�� �ҹ��ڷ� ��ȯ
		char c1='4', c2='F';
		if(Character.isDigit(c1)) // ���� c1�� �����̸� true
			System.out.println(c1 + "�� ����");
		if(Character.isAlphabetic(c2)) // ���� c2�� �������̸� true
			System.out.println(c2 + "�� ������");
		
		System.out.println(Integer.parseInt("-123")); // "-123"�� 10������ ��ȯ
		System.out.println(Integer.toHexString(28)); // ���� 28�� 16���� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28)); // ���� 28�� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.bitCount(28)); // 28�� ���� 2������ 1�� ����
		
		Double d = Double.valueOf(3.14); // Wrapper Ŭ���� Double ��ü ����
		System.out.println(d.toString()); // Double�� ���ڿ� "3.14"�� ��ȯ
		System.out.println(Double.parseDouble("3.14")); // ���ڿ��� �Ǽ� 3.14�� ��ȯ
		
		boolean b = (4>3); // b�� true
		System.out.println(Boolean.toString(b)); // true�� ���ڿ� "true"�� ��ȯ
		System.out.println(Boolean.parseBoolean("false")); // ���ڿ��� false�� ��ȯ
	}
}

/*
 * Wrapper Ŭ������ Primitive Ÿ���� Ŭ����ȭ(��üȭ)�ϴ� Ŭ�����̴�.
 * �̴�, ��ü���� ��� ������ ���� �޼ҵ带 ����� �� �ְ� ���ְ�,
 *  �Ķ���� Ÿ���� ��ü�� �޼ҵ忡 �Ķ���ͷ� ����� �����ϰ� ���ش�.
 *  Wrapper Ŭ������ �޼ҵ����, ��κ� static Ÿ���̸� �ڵ� �ڽ̰� ��ڽ��� �����Ѵ�.
 */
