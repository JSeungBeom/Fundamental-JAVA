
public class IrregularArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3]; // 0���� 3��
		intArray[1] = new int[2]; // 1���� 2��
		intArray[2] = new int[3]; // 2���� 3��
		intArray[3] = new int[2]; // 3���� 2��
		
		// 4�� �ݺ�
		for(int i = 0; i < intArray.length;i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i + 1)*10 + j; // �� ���� ���� ����ŭ �ݺ�
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
