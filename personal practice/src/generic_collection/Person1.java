package generic_collection;

import java.util.*;

public class Person1 implements Comparable<Person1>{
	public String name;
	public int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override // TreeMap, TreeSet을 위해 정렬 방법 결정
	public int compareTo(Person1 o) {
		if(age<o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
	
	public static void main(String[] args) {
		TreeSet<Person1> treeSet = new TreeSet<Person1>();
		
		treeSet.add(new Person1("홍길동", 45));
		treeSet.add(new Person1("김자바", 25));
		treeSet.add(new Person1("박지원", 31));
		
		Iterator<Person1> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person1 person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
