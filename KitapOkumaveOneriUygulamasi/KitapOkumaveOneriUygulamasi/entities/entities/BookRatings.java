package entities;

public class BookRatings {

	private String user_id;
	private String isbn;
	private String book_rating;

	public BookRatings() {
		// TODO Auto-generated constructor stub
	}

	public BookRatings(String user_id, String isbn, String book_rating) {
		super();
		this.user_id = user_id;
		this.isbn = isbn;
		this.book_rating = book_rating;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBook_rating() {
		return book_rating;
	}

	public void setBook_rating(String book_rating) {
		this.book_rating = book_rating;
	}

}
