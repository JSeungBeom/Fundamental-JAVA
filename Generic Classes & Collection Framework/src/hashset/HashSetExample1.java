package hashset;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		// String�� Ÿ�� �Ķ���ͷ� ����, Set �÷����� HashSet ��ü ����
		Set<String> set = new HashSet<String>();
		
		// Set�� ��ü���� �߰�, Set�� ����/���� ��ü�� ������ �� ����.
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // �߰� X
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		// Set�� �ε��� ���� ������ �Ұ��ϹǷ�, Iterator(�ݺ���)�� ���� ��ü�� ����
		Iterator<String> iterator = set.iterator();
		// StringTokenizer�� ����� ����
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		// �ش� ��ü ����
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		
		// ���� for���� �̿��Ͽ� Set ���� ��ü�� ����
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // Set�� ��� ��ü ����
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
	}	
}
