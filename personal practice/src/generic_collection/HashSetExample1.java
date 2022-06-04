package generic_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("IBATIS");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String elem = iterator.next();
			System.out.println("\t" + elem);
		}
		
		set.remove("JDBC");
		set.remove("IBATIS");
		
		System.out.println(set.size());
		
		for(String elem : set) {
			System.out.println("\t" + elem);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어 있음");}
	}
}
