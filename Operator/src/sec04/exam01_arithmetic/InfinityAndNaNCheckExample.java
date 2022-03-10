package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
			int x = 5;
			double y = 0.0;
			
			double z = x / y;
			// double z = x % y;
			
			System.out.println(Double.isInfinite(z));
			System.out.println(Double.isNaN(z));
			
			System.out.println(z + 2);
			// z는 이미 infinite이므로 + 연산을 진행할 수 없다.
			
			if(Double.isInfinite(z) || Double.isNaN(z)) {
				System.out.println("값 산출 불가");
			} else {
				System.out.println(z + 2);
			}
	}

}
