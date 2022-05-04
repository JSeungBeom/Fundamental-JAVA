package treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		// Binary Tree�� ������� �� Map �÷��� TreeMap
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		// ��ü ����
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		
		// TreeMap�� Key ���� �������� ������������ �����ϴ� NavigableMap 
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// ������ ������ ���ĵ� descedingMap�� Map.entry ��ü���� Set�� ��Ƽ� ����
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		// descendingMap�� �ѹ� �� ȣ���Ͽ� ������������ ����
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}

}
