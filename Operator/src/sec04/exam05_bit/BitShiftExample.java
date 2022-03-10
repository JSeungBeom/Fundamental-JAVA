package sec04.exam05_bit;

public class BitShiftExample {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1 << 3));
		// 1을 bit 단위로 왼쪽으로 3만큼 shift한다
		// 결과적으로 왼쪽으로 shift할때마다 *2가 된다. 좀 더 빠른 연산
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		// 1을 bit 단위로 오른쪽으로 3만큼 shift한다.
		// 결과적으로 오른쪽으로 shift할때마다 /2가 된다. 부호가 바뀌지 않는다.
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
		// 1을 bit 단위로 오른쪽으로 3만큼 shift한다.
		// 남은 자릿수를 0으로 채우기 때문에, 기대와 다른 결과값이 나올 수 있다.
		System.out.println(toBinaryString(1));
		System.out.println("<< 3");
		System.out.println(toBinaryString(1 << 3));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0"  + str;
		}
		return str;
	} // 수를 bit 단위로 출력하기 위해 string으로 변환하여 출력하기위한 함수

}
