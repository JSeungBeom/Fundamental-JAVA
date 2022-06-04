package generic_collection;

import java.util.Arrays;

class Person{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	public String toString() {return name;}
}

class Worker extends Person{
	public Worker(String name) {
		super(name);
	}
}

class Student extends Person{
	public Student(String name) {
		super(name);
	}
}

class HighStudent extends Student{
	public HighStudent(String name) {
		super(name);
	}
}

class Course<T>{
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
	}
	
	public String getName() {return name;}
	public T[] getStudent() {return students;}
	public void add(T t) {
		for(int i = 0; i <students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
}
public class WIldCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudent()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudent()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " +
				Arrays.toString(course.getStudent()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		registerCourse(highStudentCourse);
		registerCourse(studentCourse);
		registerCourse(workerCourse);
		System.out.println();
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
	}
}
