package Object;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode()); // �����ǵ� Object Ŭ������ hashCode() ȣ��
		System.out.println(Objects.hashCode(s2)); // ���������� s2.hashCode() ȣ�� 
		// ��������� ���� ���
	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno, name); // �Ű������� �ؽ��ڵ带 �����ϴ� ����
		}
	}
}
