package sec03.exam03_accuracy;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; // int 타입 num2를 double타입 num3로 promotion
		num2 = (int) num3; // promotion된 값을 num2에 다시 casting
		
		int result = num1 - num2; // result가 0이라면, 데이터의 손실이 발생하지 않음을 확인
		System.out.println(result);
	}
}
