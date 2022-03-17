package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int scores[] = {83, 90, 87};
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		} // java에서는, 배열의 크기를 저장하고 있는 length 필드를 사용할 수 있다.
		System.out.println("총합 : " + sum);
		double avg = (double)sum/scores.length;
		System.out.println("평균 : " + avg);
	}

}
