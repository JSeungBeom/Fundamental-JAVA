package sec02.exam01_byte;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2); 
		}
	}
} 
// 127에서 1을 더하면, 부호 비트가 바뀌며 가장 작은 수 (-128)이 된다.
