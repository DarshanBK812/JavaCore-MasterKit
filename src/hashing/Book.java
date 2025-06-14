package hashing;

import java.util.HashSet;

public class Book {

	String title;
	int isbn;

	public Book(String title, int isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Book book = (Book) obj;
		return this.isbn == book.isbn;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.hashCode(isbn);
	}

	public static void main(String[] args) {
		HashSet<Book> books = new HashSet<Book>();
		Book book = new Book("morvel", 1);
		Book book2 = new Book("novel", 1);

//		System.out.println(book.equals(book2));
//		System.out.println();
		books.add(book2);
		books.add(book);
		System.out.println(books.size());

//		System.out.println(book.isbn);
		System.out.println(books.contains(book));
//		System.out.println(book.hashCode());
//
//		System.out.println(book2.hashCode());

	}

}
