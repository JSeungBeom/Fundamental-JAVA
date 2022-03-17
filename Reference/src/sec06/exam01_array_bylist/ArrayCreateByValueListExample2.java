package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
			int[] scores;
			scores = new int[] {83, 90, 87};
			// scores 배열을 동적 할당하고, 초기화
			int sum1 = 0;
			for(int i = 0; i<3; i++) {
				sum1+=scores[i];
			}
			System.out.println("총합 : " + sum1);
			
			int sum2 = add(new int[] {83,90,87});
			// add 함수의 parameter로 동적 배열을 전달
			System.out.println("총합 : " + sum2);
			System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i =0;i<3;i++) {
			sum += scores[i];
		}
		return sum;
	} // 배열을 parameter로 전달받아 sum을 구하는 함수

}
