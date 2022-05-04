package comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// 타입 파라미터로 Person을 갖는 TreeSet
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// age 필드 값에 따라서 TreeSet이 정렬
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		// treeSet에 접근할 때 사용되는 반복자
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}

}
