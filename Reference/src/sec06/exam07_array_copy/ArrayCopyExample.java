package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String oldStrArray[] = {"java", "array", "copy"}; // ���� 3�� string Ÿ�� �迭
		String newStrArray[] = new String[5]; // ���� 5�� string Ÿ�� �迭�� new�� ����
		
		System.arraycopy(oldStrArray,  0, newStrArray, 0, oldStrArray.length);
		/* arraycopy(src_array, src_start, dest_array, dest_start, length) : �迭 ���� �޼ҵ�
		 �⺻ Ÿ�� �迭�� �����ϴ� ���, ���ο� ��ü �迭�� �����Ͽ� deep copy�� ����������,
		 ���� Ÿ�� �迭�� �� �迭�� ��Ұ� ���� �����μ�, �� string ��ü�� �����ϹǷ� ���������
		 arraycopy �޼ҵ�� string Ÿ���� deep copy�� ������� �ʴ´�. */
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		} // string Ÿ�� �迭�� ��Ҵ� null(�ּҰ�)�� �ʱ�ȭ�ȴ�
	}

}
