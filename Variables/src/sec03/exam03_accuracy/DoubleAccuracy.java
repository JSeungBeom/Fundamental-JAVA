package sec03.exam03_accuracy;
import java.math.BigDecimal;

public class DoubleAccuracy {

	public static void main(String[] args) {
		double total = 0;
		total += 5.6;
		System.out.println(total);
		total += 5.8;
		System.out.println(total); // ���� ���� ��Ȯ�ϰ� ��µ��� ����
		
		double num = 0.1;
		for(int i = 0; i < 10000; i++) {
			num += 0.1;
		}
		System.out.println(num); // ���� ���� ��Ȯ�ϰ� ��µ��� ����
		
		double a = 77.124;
		System.out.println(a*100000); // ���� ���� ��Ȯ�ϰ� ��µ��� ����
		// ��� ���� �ٸ� ���� ��µǴ� ������, double Ÿ���� ���������� ���� �������� �ٻ�ġ�� �����ϱ� �����̴�.
		BigDecimal x1= new BigDecimal("77.124");
		BigDecimal y1 = new BigDecimal("100000"); 
		// BigDeciaml�� Parenthesis �ȿ��� ���ڿ��� ����, �� ""�� ����ִ� ���¿��� ������ �� ����� ����
		// BigDeciaml�� Java���� ���ڸ� �����ϰ� ����, ǥ���� �� �ִ� ���
		System.out.println(x1.multiply(y1)); // ��Ȯ�� ���� ���� ���
	}

}
