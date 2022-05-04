package arraylist;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// String�� Ÿ�� �Ķ���ͷ� ����, List �÷����� ArrayList ��ü ����
		List<String> list = new ArrayList<String>();
		
		// add(E e) : ��ü�� ����Ʈ�� �� ���� �߰�
		// add(int index, E e) : ��ü�� �ش� �ε����� �߰��ϰ�, ������ ��ü�� �ڷ� ��ĭ�� ����
		list.add("Java"); 
		list.add("JDBC"); 
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // ����Ʈ�� ũ�� ����
		System.out.println("�� ��ü��: " + size);
		System.out.println();
		
		String skill = list.get(2); // �ε��� 2�� ��ü ����
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); // �ε��� 2�� ��ü ����
		list.remove(2);
		list.remove("iBATIS"); // �ش� ��ü ����
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
