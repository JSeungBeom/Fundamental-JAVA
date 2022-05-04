package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키는 중복될 수 없지만 값은 중복 저장 가능
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // map의 키 값들을 Set에 담아 리턴
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key); // 키 값에 해당하는 value 값 리턴
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동"); // "홍길동" key 값에 해당하는 entry 삭제
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry 객체들을 Set에 담아 리턴
		// Map.Entry<String, Integer> 파라미터 타입을 갖는 반복자 entryIterator
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}

}
