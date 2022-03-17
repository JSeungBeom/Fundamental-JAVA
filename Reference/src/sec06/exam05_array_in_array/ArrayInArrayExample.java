package sec06.exam05_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		// 2�� �迭�� ����, java���� ���� �迭�� ���� ������ �� �࿡ �ش��ϴ� �迭�� ����Ű��
		// �� ���� ������ �迭�� ����, ���������� ���� �迭�� ����� ����
		
		for(int i = 0; i < mathScores.length; i++) {
			for(int k =0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + 
				mathScores[i][k]);
			}
		} // mathScores.length�� ���� ���̸� ��Ÿ����, �� mathScores[i].length�� ���� ���̸� ��Ÿ����
		System.out.println();
		
		int[][] englishScores = new int[2][]; 
		englishScores[0] = new int[2]; // 0���� 2���̴�
		englishScores[1] = new int[3]; // 1���� 3���̴�
		// �ռ� ����, java������ ���� �迭�� Ư���� �̿��Ͽ� ��������(�� �ึ�� ���̰� �ٸ�) �迭�� ���� �� �ִ�.
		for(int i = 0; i < englishScores.length; i++) {
			for(int k =0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + 
				englishScores[i][k]);
			}
		}		
		System.out.println();
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		// �������� �迭�� �ٸ� ����� �ʱ�ȭ
		for(int i = 0; i <javaScores.length; i++) {
			for(int k =0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]=" + 
				javaScores[i][k]);
			}
		}
	}

}
