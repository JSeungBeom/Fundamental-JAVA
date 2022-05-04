package hashset;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 물리적으로는 다른 객체이지만, 재정의를 통해 논리적으로 동등하므로 중복 추가 X
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
	}

}
