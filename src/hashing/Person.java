package hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//->Hash table uses a hashing technique  to store the data for backet array
//->Hasing technique which is used to find hashcode value using hasing funtion  
//->to find index for object in array uses a modulous funtion ex:- index = hashcode % array.length
//->after getting a index the key of the set  ot map data will be store in the particular index of the array by creating new node 
//-> Before storing data in the form of node  1st it will check in the  index weather is already have node why it happens means
//->Some times objects may get same hashcode with a same index in that time data will stores in the same index by appending the new node with a exsited node
//->Before appending the new node the rule is to not store the duplicate keys in table so if we soring a 2 or 3 nodes with a same hashCode and index for the object 
//->to ensure that we use equals method to check the key is already present with a same name in the memory if it is same it just replace it or else append the node with a key ,value, adress of the next node and previous node
//->This is called hash collison

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
