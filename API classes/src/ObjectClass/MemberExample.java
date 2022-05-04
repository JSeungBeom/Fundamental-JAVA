package ObjectClass;

class Member{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 논리적 동등 비교를 위해, equals 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// obj가 Member 타입을 참조하는 객체인지 검사
		if(obj instanceof Member) {
			Member member = (Member) obj; // down-casting
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// obj1과 obj2의 id가 논리적으로 동등하므로 true
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		// obj1과 obj3의 id가 다르므로 false
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}

}
