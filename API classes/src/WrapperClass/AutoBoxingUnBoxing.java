package WrapperClass;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // 자동 박싱 (auto boxing)
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // 자동 언박싱 (auto unboxing)
		System.out.println("m = " + m);
	}
}

/*
 * 박싱(boxing) : 기본 타입의 값을 Wrapper 객체로 변환
 * 언박싱(unboxing) : Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것
 */
