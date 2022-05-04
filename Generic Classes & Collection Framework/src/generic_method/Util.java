package generic_method;

public class Util {
	// �Ű����� Ÿ������ Ÿ�� �Ķ���͸� ���� �޼ҵ�
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}

/*
 * ���׸� �޼ҵ�(Generic Method) : �Ű� ���� Ÿ�԰� ���� Ÿ������ Ÿ�� �Ķ���͸� ���� �޼ҵ�
 * ���� ��, ���� Ÿ�� �տ� <> ��ȣ�� �߰��ϰ� Ÿ�� �Ķ���� ���
 * Ÿ�� �Ķ���͸� ���� Ÿ�԰� �Ű� ������ ���
 */
