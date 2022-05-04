package hashset;

public class Member {
	// 필드
	public String name;
	public int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	// HashSet에 객체를 추가할 때, HashSet은 hashCode() 리턴 값과, equals() 리턴 값으로 동일 객체를 판단
	// 따라서, 해당 메소드들을 재정의하여 논리적 동등 관계를 만듦
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return name.hashCode() + age;
	}
}
