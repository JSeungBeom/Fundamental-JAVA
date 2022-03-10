package sec04.exam05_bit;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		// and 연산 
		// 비트 연산, 각 비트를 비교하여 둘 다 1이면 1, 둘 중 하나라도 0이면 0이 된다
		System.out.println("45 | 25 = " + (45 | 25));
		// or 연산
		// 비트 연산, 각 비트를 비교하여 둘 다 0이면 0, 둘 중 하나라도 1이면 1이 된다
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		// xor 연산
		// 비트 연산, 각 비트를 비교하여 다르다면 1, 같다면 0이 된다
		System.out.println("~45 = " + (~45));
		// 비트 반전 연산 (1의 보수)
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	} // 수를 bit 단위로 출력하기 위한 함수
}
