package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int oldIntArray[] = {1, 2, 3}; // ���� 3�� �迭 ���� �� �ʱ�ȭ
		int newIntArray[] = new int[5]; // ���� 5�� �迭�� new�� ����, int Ÿ�� �迭�� �ʱⰪ�� 0
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		} // ���� ���縦 ����
		// java�� �迭�� length �ʵ带 �̿��Ͽ� �迭�� ���̸� ���� �� �ִ�
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}  // ���� ���縦 ������ newIntArray�� ��ҵ��� ���� ����Ѵ�
	}

}
