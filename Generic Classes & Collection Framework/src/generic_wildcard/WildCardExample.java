package generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	// ���׸�Ÿ��<?> : Unbounded Wildcards (���Ѿ���)
	// Ÿ�� �Ķ���͸� ��ġ, ��� Ŭ������ �������̽� Ÿ�� ��� ����
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudents()));
	}
	// ���׸�Ÿ��<? extends ���� Ÿ��>
	// �ش� ���� Ÿ�԰� ���� ���� Ÿ���� ��� ����(Student, HighStudent)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudents()));
	}
	
	// ���׸�Ÿ��<? super ����Ÿ��>
	// �ش� ���� Ÿ�԰� ���� ���� Ÿ���� ��� ����(Worker, Person)
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + 
				Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		// ���׸� Ÿ�� Course�� Ÿ�� �Ķ���͸� Person���� �ϴ� ��ü ����
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		// ��� Ÿ�� �Ķ���͸� ���� Course ��ü�� ��� ����
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// Course ��ü ��, Ÿ�� �Ķ���ͷ� Student�� �� ���� Ÿ���� highStudent�� ���� ��ü�� ��� ����
		// registerCourseStudent(personCourse);
		// registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		// Course ��ü ��, Ÿ�� �Ķ���ͷ� Worker�� �� ���� Ÿ���� Person�� ���� ��ü�� ��� ����
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse);
		// registerCourseWorker(highStudentCourse);
	}

}
