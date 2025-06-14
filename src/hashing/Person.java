package hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		else if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Person person = (Person) object;
		return (name == person.name && age == person.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	public static void main(String[] args) {
//		Person person = ;
//		Person person2 = ;
//
		Person person = new Person("darshan", 22);
		Person person2 = new Person("darshan", 22);

		Set<Person> persons = new HashSet<Person>();
		persons.add(person);
		persons.add(person2);

		System.out.println(person.equals(person2));
		System.out.println(person.hashCode());
		System.out.println(person2.hashCode());

	}

}
