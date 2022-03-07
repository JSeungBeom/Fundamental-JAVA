package sec02.exam05_float_double;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		// float var2 = 3.14; 숫자 뒤에 float타입이라는 f를 명시적으로 표시해주지 않았기 때문에, 컴파일 에러 발생
		float var3 = 3.14F;
		
		double var4 = 0.123456789012345678;
		float var5 = 0.1235467890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		int var6 = 30000000;
		double var7 = 3e6; // 3e6의 의미는, 3 x 10의 6승이라는 의미이다.
		float var8 = 3e6F;
		double var9 = 2e-3; // 2e-3은 2 x 10의 -3승
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}
}
