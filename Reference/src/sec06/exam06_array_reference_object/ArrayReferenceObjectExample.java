package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String strArray[] = new String[3];
		// string Ÿ���� �迭 ����
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		// strArray[2]���� ���ο� String ��ü�� �����Ͽ� ����
		
		System.out.println(strArray[0] == strArray[1]);
		// �� ���� ������, ���� ��ü�� ����Ű�Ƿ� true	
		System.out.println(strArray[0] == strArray[2]);
		// �� ���� ������, �ٸ� ��ü�� ����Ű�Ƿ� false	
		System.out.println(strArray[0].equals(strArray[2]));
		// �� �迭 ����� ���ڿ��� �����ϹǷ� true
	}

}
