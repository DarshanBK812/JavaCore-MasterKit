package immutable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// <To achieve Immutable class>
//1.Use final along class 
//2.feilds are private and final
//3.provide constructor to initialize feilds
//4.provide getter method and dont provide setter methods
//5.override .equals and hashCode methods(Objects.hash(fields , feilds)

public final class Person_Immutable {

	private final String name;
	private final int age;

	public Person_Immutable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		else if (object == null || this.getClass() != object.getClass())
			return false;

		Person_Immutable immutable = (Person_Immutable) object;
		return name.equals(immutable.name) && age == immutable.age;
	}

	public int hashCode() {
		return Objects.hash(name, age);
	}

	public static void main(String[] args) {

		String str = "chandu";
		String str2 = "chandu";
		System.out.println(str.equals(str2));

		Person_Immutable person_Immutable = new Person_Immutable("darshan", 2);
		Person_Immutable person_Immutable2 = new Person_Immutable("darshan", 2);

		System.out.println(person_Immutable.equals(person_Immutable2));

//		person_Immutable.name = "chandu";

		System.out.println(person_Immutable.equals(person_Immutable2));

//		System.out.println(person_Immutable.getName());
//		System.out.println(person_Immutable2.getName());

//		Set<Person_Immutable> people = new HashSet<>();
//		people.add(new Person_Immutable("Darshan", 23));
//		people.add(new Person_Immutable("Darshan", 23));
//		System.out.println(people.size());

		ArrayList<String> arrayList = new ArrayList<String>();

//		person_Immutable.name = "cat";
	}

}
