package StringClass;

public class compareTo {

	public static void main(String[] args) {
		String java = "java";
		String cpp = "C++";
		// int compareTo() �޼ҵ� : ���ڿ��� ������ 0 ����
		// �� ���ڿ����� ������ ���� ������ ����, ���߿� ������ ��� ����
		int res = java.compareTo(cpp); // java�� c++���� ������ ���߿� �����Ƿ� ���
		if(res == 0) 
			System.out.println("the same");
		else if(res < 0)
			System.out.println(java + " < " + cpp);
		else
			System.out.println(java + " > " + cpp);
	}
}
