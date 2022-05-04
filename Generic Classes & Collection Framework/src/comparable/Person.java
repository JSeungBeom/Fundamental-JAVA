package comparable;

public class Person implements Comparable<Person> {
	// 필드
	public String name;
	public int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Comparable 인터페이스의 compareTo 메소드를 재정의
	// TreeSet이나 TreeMap에 객체를 삽입할 때, 어떤 값을 기준으로 정렬할 것인지를 구현해줘야 함.
	// 아니면 Exception 발생
	@Override
	public int compareTo(Person o) {
		if(age < o.age)
			return -1;
		else if(age == o.age)
			return 0;
		else
			return 1;
	}
}
