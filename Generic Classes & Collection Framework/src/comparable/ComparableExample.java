package comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// Ÿ�� �Ķ���ͷ� Person�� ���� TreeSet
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// age �ʵ� ���� ���� TreeSet�� ����
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		// treeSet�� ������ �� ���Ǵ� �ݺ���
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}

}
