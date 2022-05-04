package ObjectClass;

class Member{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// ���� ���� �񱳸� ����, equals �޼ҵ� �������̵�
	@Override
	public boolean equals(Object obj) {
		// obj�� Member Ÿ���� �����ϴ� ��ü���� �˻�
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
		
		// obj1�� obj2�� id�� �������� �����ϹǷ� true
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		// obj1�� obj3�� id�� �ٸ��Ƿ� false
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
