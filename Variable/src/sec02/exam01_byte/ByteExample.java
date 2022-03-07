package sec02.exam01_byte;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128; 컴파일 에러
		// byte 타입은 1bit의 부호 비트, 7bit의 가수 비트로 구성된다.
		// -128 ~ 127까지 표현이 가능
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
