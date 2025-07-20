package oop_Design_Oriented_Scenarios_problems.librory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oop_Design_Oriented_Scenarios.librory.Library;

public class LibraryService extends Library {

	public LibraryService(List<Book> books, List<User> users) {
		super(books, users);
	}

	HashMap<User, Integer> map = new HashMap<>();

	@Override
	public void barrowBook(User user, Book book) {

		int count = map.put(user, map.getOrDefault(user, 0));

		if (count > 3) {
			System.out.println("Cannot barrow ");
			return;
		}
		map.put(user, count + 1);

		System.out.println(user.getUserName() + " barrowred a " + book.getBookTitle() + " book");

	}

	@Override
	public void returnBook(User user, Book book) {
		System.out.println(user.getUserName() + " returned a " + book.getBookTitle() + " book");
	}

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Darshan"));
		users.add(new User(2, "Chandu"));
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "ramayana"));
		books.add(new Book(2, "Mahabaratha"));
		books.add(new Book(3, "C"));
		books.add(new Book(4, "d"));
		
		Library library = new LibraryService(books, users);
		library.barrowBook(library.getUsers().get(0), library.getBooks().get(1));
		System.out.println();
	}

}
