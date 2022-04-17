package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int oldIntArray[] = {1, 2, 3}; // 길이 3의 배열 생성 및 초기화
		int newIntArray[] = new int[5]; // 길이 5의 배열을 new로 생성, int 타입 배열의 초기값은 0
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		} // 깊은 복사를 진행
		// java의 배열은 length 필드를 이용하여 배열의 길이를 얻을 수 있다
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}  // 깊은 복사를 진행한 newIntArray의 요소들을 각각 출력한다
	}

}
