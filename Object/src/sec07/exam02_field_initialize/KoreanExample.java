package sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("pby", "900212-2234567");
		// k1 ��ü�� �����ϸ�, ������ �Լ� ȣ��. name�� ssn�� �ش� parameter�� �ʱ�ȭ
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("dlwlrma", "930516-2654321");
		// �� �ٸ� k2 ��ü�� �����ϰ� ������ �Լ� ȣ��
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
	}
}
