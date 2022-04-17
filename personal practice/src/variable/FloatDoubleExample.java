package variable;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수값 저장
		double var1 = 3.14;
		// float var2 = 3.14; double타입 리터럴을 float 타입 변수에 저장하려 하여 컴파일 에러
		float var3 = 3.14F; // float 타입 리터럴에 F를 명시
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		// 실수 타입 변수들은 근사값을 저장하므로, 값이 예상과 다르게 저장될 수 있다.
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6; // = 3x10^6
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
		
	}

}
