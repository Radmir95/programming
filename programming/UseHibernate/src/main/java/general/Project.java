package main.java.general;

import java.sql.SQLException;
import java.util.List;

import main.java.dao.BookDao;
import main.java.table.Book;

public class Project {
	public static void main(String[] args) throws SQLException{
		Factory fact = Factory.getInstance();
		BookDao bookDao = fact.getBookDao();
		
		List<Book> book = bookDao.getBooks();
		
		System.out.println("Id    Isbn     Tittle");
		
		for(Book books : book){
			System.out.println(books.getId() + "  " + books.getIsbn() + "  "  + books.getTittle());
		}
	}
	
}
