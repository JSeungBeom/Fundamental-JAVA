package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if((i<Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} // 만약 casting을 하는 과정에서, 데이터가 손실될 위험(나타낼 수 있는 값의 범위를 초과한 경우)
		// casting을 진행하지 않고, 다음과 같은 문장을 출력
		else {
			byte b = (byte)i;
			System.out.println(b);
		}
	} // 표현 가능한 값의 범위에 있을 경우, casting을 진행한다

}
