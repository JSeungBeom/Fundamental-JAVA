package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int 타입 num2를 float타입 num3로 promotion
		System.out.println(num3); // float 타입의 변수가 int 타입의 충분히 큰 수를 저장하기에 부족하여, 정확한 수가 출력되지 않음
		num2 = (int)num3; // 다시 num3를 int 타입으로 casting
		System.out.println(num2); // 이전의 수와 다른 수가 출력
		
		int result = num1 - num2; // 결과가 0이라면, 데이터의 손실이 없음을 확인
		System.out.println(result);

	}

}
