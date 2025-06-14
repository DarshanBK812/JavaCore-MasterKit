package hashing;

import java.util.HashSet;

public class Student {

	String name;
	int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
//		if (obj == null || getClass() != obj.getClass())
//			return false;
		Student student = (Student) obj;
		return this.id == student.id;
	}

	@Override
	public int hashCode() {

		return Integer.hashCode(2);
	}

	public static void main(String[] args) {
//		Student student = new Student("darshan", 1);
//		Student student2 = new Student("darshan", 1);
//		Student student3 = student;
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add( new Student("darshan", 1));
		hashSet.add( new Student("chandu", 1));
		
//		System.out.println(student.equals(student2));
//		System.out.println(student.equals(student3));
//		System.out.println(student.hashCode());
//		System.out.println(student2.hashCode());
		
		System.out.println(hashSet.contains(new Student("chandu", 1)));
		
		
	}

}
