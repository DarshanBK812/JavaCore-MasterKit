package library;

public class Book {

	private int boodId;
	private String bookTitle;
	private String bookAuthor;
	private String genre;
	private int publicationYear;

	public Book(int id, String title, String author, String genre, int publish) {
		boodId = id;
		bookTitle = title;
		bookAuthor = author;
		this.genre = genre;
		publicationYear = publish;
	}

	public int getBoodId() {
		return boodId;
	}

	public void setBoodId(int boodId) {
		this.boodId = boodId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	@Override
	public String toString() {
		return "Book [boodId=" + boodId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", genre=" + genre
				+ ", publicationYear=" + publicationYear + "]";
	}

}
