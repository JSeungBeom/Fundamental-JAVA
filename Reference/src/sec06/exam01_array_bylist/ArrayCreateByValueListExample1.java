package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		// 길이 3의 int 타입 배열을 선언, 초기화
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		// 배열의 index는 0부터 시작한다.
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum+=scores[i];
		} // 배열의 모든 요소들을 sum에 더하여 저장
		System.out.println("총합 : " + sum); // sum을 출력
		double avg = (double)sum / 3; // sum을 3으로 나눈 값, 평균
		System.out.println("평균 : " + avg); // 평균을 출력
	}

}
