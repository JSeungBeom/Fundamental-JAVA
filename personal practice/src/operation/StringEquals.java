package operation;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "dlwlrma";
		String strVar2 = "dlwlrma"; // �� ��Ʈ�� ���� ������ ���� ��ü�� ����Ű�� �ȴ�.
		String strVar3 = new String("dlwlrma"); // ���ο� ��ü ����
		
		System.out.println(strVar1 == strVar2); // ���� ��ü�� ����Ű�Ƿ� true
		System.out.println(strVar1 == strVar3); // �ٸ� ��ü�� ����Ű�Ƿ� false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); 
		System.out.println(strVar1.equals(strVar3)); // ���ڿ��� ���ϴ� String ��ü�� equals �޼ҵ�
	}

}
