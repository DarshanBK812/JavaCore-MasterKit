package oop_Design_Oriented_Scenarios.librory;

import java.util.List;

import oop_Design_Oriented_Scenarios_problems.librory.Book;
import oop_Design_Oriented_Scenarios_problems.librory.User;

public abstract class Library {

	private List<Book> books;
	private List<User> users;

	public Library(List<Book> books, List<User> users) {
		super();
		this.books = books;
		this.users = users;
	}

	public abstract void barrowBook(User user, Book book);

	public abstract void returnBook(User user, Book book);

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
