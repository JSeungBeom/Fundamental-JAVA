
public class IrregularArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3]; // 0행은 3열
		intArray[1] = new int[2]; // 1행은 2열
		intArray[2] = new int[3]; // 2행은 3열
		intArray[3] = new int[2]; // 3행은 2열
		
		// 4번 반복
		for(int i = 0; i < intArray.length;i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i + 1)*10 + j; // 각 행의 열의 수만큼 반복
			}
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++	) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
