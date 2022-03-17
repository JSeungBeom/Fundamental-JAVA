package sec06.exam05_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		// 2중 배열을 생성, java에서 다중 배열은 참조 변수가 각 행에 해당하는 배열을 가리키고
		// 그 참조 변수를 배열로 묶어, 실질적으로 다중 배열을 만드는 형태
		
		for(int i = 0; i < mathScores.length; i++) {
			for(int k =0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + 
				mathScores[i][k]);
			}
		} // mathScores.length는 열의 길이를 나타내고, 각 mathScores[i].length는 행의 길이를 나타낸다
		System.out.println();
		
		int[][] englishScores = new int[2][]; 
		englishScores[0] = new int[2]; // 0행은 2열이다
		englishScores[1] = new int[3]; // 1행은 3열이다
		// 앞서 말한, java에서의 다중 배열의 특성을 이용하여 비정방형(각 행마다 길이가 다른) 배열을 만들 수 있다.
		for(int i = 0; i < englishScores.length; i++) {
			for(int k =0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + 
				englishScores[i][k]);
			}
		}		
		System.out.println();
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		// 비정방형 배열의 다른 방법의 초기화
		for(int i = 0; i <javaScores.length; i++) {
			for(int k =0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]=" + 
				javaScores[i][k]);
			}
		}
	}

}
