package arraylist;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// String을 타입 파라미터로 갖는, List 컬렉션의 ArrayList 객체 생성
		List<String> list = new ArrayList<String>();
		
		// add(E e) : 객체를 리스트의 맨 끝에 추가
		// add(int index, E e) : 객체를 해당 인덱스에 추가하고, 나머지 객체를 뒤로 한칸씩 밀음
		list.add("Java"); 
		list.add("JDBC"); 
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // 리스트의 크기 리턴
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2); // 인덱스 2의 객체 리턴
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); // 인덱스 2의 객체 삭제
		list.remove(2);
		list.remove("iBATIS"); // 해당 객체 삭제
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
