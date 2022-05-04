package hashset;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		// String을 타입 파라미터로 갖는, Set 컬렉션의 HashSet 객체 생성
		Set<String> set = new HashSet<String>();
		
		// Set에 객체들을 추가, Set은 동일/동등 객체를 저장할 수 없다.
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 추가 X
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Set은 인덱스 단위 접근이 불가하므로, Iterator(반복자)를 통해 객체에 접근
		Iterator<String> iterator = set.iterator();
		// StringTokenizer와 비슷한 구조
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		// 해당 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		// 향상된 for문을 이용하여 Set 내의 객체에 접근
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // Set의 모든 객체 삭제
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}	
}
