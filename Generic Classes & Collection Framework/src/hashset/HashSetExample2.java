package hashset;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// ���������δ� �ٸ� ��ü������, �����Ǹ� ���� �������� �����ϹǷ� �ߺ� �߰� X
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ü�� : " + set.size());
	}

}
