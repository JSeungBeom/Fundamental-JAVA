package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} 
		else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		} // strVar1�� strVar2�� ���� ��ü�� �����ϰ� �����Ƿ�, ���ٰ� ���
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		} // �ܼ� ���ڿ��� ���ϹǷ�, strVar1�� strVar2�� ���ڿ��� ����
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} 
		else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		} // strVar3�� strVar4�� �ٸ� ��ü�� �����ϰ� �����Ƿ�, �ٸ��ٰ� ���
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		} // �ܼ� ���ڿ��� ���ϹǷ�, strVar3�� strVar4�� ���ڿ��� ����
	}

}
