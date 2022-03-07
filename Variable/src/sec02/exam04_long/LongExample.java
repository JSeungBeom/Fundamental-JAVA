package sec02.exam04_long;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 100000000000; long 타입 리터럴은 뒤에 L 또는 l을 붙여 명시적으로 표시하여야 하는데,
		// 명시하지 않을 경우, int 타입으로 취급되어 충분히 큰 숫자를 표현할 수 없다.
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
