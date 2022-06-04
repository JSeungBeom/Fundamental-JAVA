package generic_collection;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("IBATIS");
		
		System.out.println(list.size());
		System.out.println();
		
		System.out.println("2: " + list.get(2));
		
		for(String l:list) {
			System.out.println(l);
		}
		
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("IBATIS");
		
		for(String l : list) {
			System.out.println(l);
		}
	}

}
