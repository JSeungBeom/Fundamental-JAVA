package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		// ���� 3�� int Ÿ�� �迭�� ����, �ʱ�ȭ
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		// �迭�� index�� 0���� �����Ѵ�.
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum+=scores[i];
		} // �迭�� ��� ��ҵ��� sum�� ���Ͽ� ����
		System.out.println("���� : " + sum); // sum�� ���
		double avg = (double)sum / 3; // sum�� 3���� ���� ��, ���
		System.out.println("��� : " + avg); // ����� ���
	}

}
