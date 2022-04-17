package variable;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		// casting 할수 있는지 확인, i는 byte 타입의 MAX_VALUE를 벗어나므로 casting 불가
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		}
		else {
			byte b = (byte) i;
			System.out.println(b);
		}

	}

}
