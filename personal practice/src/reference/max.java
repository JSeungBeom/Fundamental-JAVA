package reference;
import java.util.Scanner;
public class max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i]	= scanner.nextInt();
		}
		int max = intArray[0];
		for(int i = 1; i < intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		scanner.close();
	}
}
