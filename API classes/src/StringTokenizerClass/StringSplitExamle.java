package StringTokenizerClass;

public class StringSplitExamle {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-"); // split �޼ҵ�� delimiter ���� �������� String �迭 ��ȯ
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}

/*
 * StringTokenizer�� split() �޼ҵ�� raw �����͵��� �����ϰ��� �Ҷ� ��� ����
 */
