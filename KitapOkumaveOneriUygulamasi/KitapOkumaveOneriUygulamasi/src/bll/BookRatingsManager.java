package bll;

import java.util.ArrayList;

import entities.BookRatings;
import interfaces.IBookRatings;

public class BookRatingsManager implements IBookRatings {
	IBookRatings bookRatings;

	public BookRatingsManager(IBookRatings bookRatings) {
		// TODO Auto-generated constructor stub
		super();
		this.bookRatings = bookRatings;
	}

	@Override
	public boolean BookRatingsEkleme(BookRatings entity) {
		// TODO Auto-generated method stub
		return bookRatings.BookRatingsEkleme(entity);
	}

	@Override
	public ArrayList<BookRatings> PopularBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookRatings> TopRatedBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
