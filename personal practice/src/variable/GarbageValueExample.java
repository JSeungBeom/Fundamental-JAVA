package variable;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125; 
		// overflow�� �߻��Ͽ�, byte Ÿ�� ���� ���ͷ��� 127���� 1�� ���ϸ� -128�� �ȴ�
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2	);
		}
	}

}
