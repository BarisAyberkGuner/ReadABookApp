package dalconcrete;

import java.sql.Connection;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.BookRatings;
import interfaces.IBookRatings;

public class BookRatingsRepositoryMySql implements IBookRatings{
	Connection baglanti;
	
	public BookRatingsRepositoryMySql() {
		// TODO Auto-generated constructor stub
		this.baglanti = new MySqlBaglanti().Baglanti();
	}
	@Override
	public boolean BookRatingsEkleme(BookRatings entity) {
		// TODO Auto-generated method stub
		try {
			String BookRatingsEkleme = "insert into bx_book_ratings"+"user_id,isbn,book_rating"+"values(?,?,?)";
			PreparedStatement psmt= baglanti.prepareStatement(BookRatingsEkleme);
			
			psmt.setString(1,entity.getUser_id());
			psmt.setString(2,entity.getIsbn());
			psmt.setString(3,entity.getBook_rating());
			
			return psmt.executeUpdate()>0;
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Hata:" + e.getMessage());
			return false;
		}
	}
	@Override
	public ArrayList<BookRatings> PopularBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<BookRatings> TopRatedBooks() {
		// TODO Auto-generated method stub
		//select isbn,AVG(book_rating) from bx_book_ratings GROUP by isbn order by AVG(book_rating) desc
		ArrayList<BookRatings> Ratings = new ArrayList<>();
		try {
			String TopRatedBooks= "select isbn,AVG(book_rating) from bx_book_ratings GROUP BY isbn ORDER BY AVG(book_rating) desc LIMIT 10";
			Statement stmp = baglanti.createStatement();
			ResultSet rs = stmp.executeQuery(TopRatedBooks);
			
			while(rs.next()) {
				BookRatings br = new BookRatings();
				br.setIsbn(rs.getString(1));
				br.setBook_rating(rs.getString(2));
				br.setUser_id(rs.getString(3));
				
				Ratings.add(br);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Ratings;
	}

}
