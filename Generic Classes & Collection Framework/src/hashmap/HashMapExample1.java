package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // Ű�� �ߺ��� �� ������ ���� �ߺ� ���� ����
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); // map�� Ű ������ Set�� ��� ����
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key); // Ű ���� �ش��ϴ� value �� ����
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿"); // "ȫ�浿" key ���� �ش��ϴ� entry ����
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry ��ü���� Set�� ��� ����
		// Map.Entry<String, Integer> �Ķ���� Ÿ���� ���� �ݺ��� entryIterator
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}

}
