package treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		// Binary Tree를 기반으로 한 Map 컬렉션 TreeMap
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		// 객체 삽입
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
		// TreeMap을 Key 값을 기준으로 내림차순으로 저장하는 NavigableMap 
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// 내림차 순으로 정렬된 descedingMap의 Map.entry 객체들을 Set에 담아서 리턴
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		// descendingMap을 한번 더 호출하여 오름차순으로 저장
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}

}
