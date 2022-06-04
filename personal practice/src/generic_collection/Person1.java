package generic_collection;

import java.util.*;

public class Person1 implements Comparable<Person1>{
	public String name;
	public int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override // TreeMap, TreeSet�� ���� ���� ��� ����
	public int compareTo(Person1 o) {
		if(age<o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
	
	public static void main(String[] args) {
		TreeSet<Person1> treeSet = new TreeSet<Person1>();
		
		treeSet.add(new Person1("ȫ�浿", 45));
		treeSet.add(new Person1("���ڹ�", 25));
		treeSet.add(new Person1("������", 31));
		
		Iterator<Person1> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person1 person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
