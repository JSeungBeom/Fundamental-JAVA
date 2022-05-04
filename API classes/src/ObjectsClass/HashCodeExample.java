package ObjectsClass;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		// ���������δ� �ٸ� ��ü�� �����ϹǷ�, �ؽ��ڵ尡 �ٸ����� 
		// hashCode() �޼ҵ� �����Ǹ� ����, �������� ����
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		// �ʵ� ����� hashCode �����Ͽ� return �ϵ��� Object Ŭ������ hashCode() �޼ҵ� ������
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}


