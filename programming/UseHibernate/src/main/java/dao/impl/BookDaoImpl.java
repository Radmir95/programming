package main.java.dao.impl;

import java.sql.SQLException;
import java.util.List;

import main.java.dao.BookDao;
import main.java.table.Book;
import main.java.util.HibernateUtil;

import org.hibernate.Session;

public class BookDaoImpl implements BookDao {

	@Override
	public void addBook(Book book) throws SQLException {
			Session session = null;
		try{
			
			session = HibernateUtil.getInstance().openSession();
			session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
		}
		catch(Exception e){e.printStackTrace();}
		finally{
			if (session != null && session.isOpen())
		session.close();}
		
		
	}

	@Override
	public void deleteBook(Book book) throws SQLException {
		Session session = null;
		try{
			
			session = HibernateUtil.getInstance().openSession();
			session.beginTransaction();
			session.delete(book);
			session.getTransaction().commit();
		}
		catch(Exception e){e.printStackTrace();}
		finally{
			if (session != null && session.isOpen())
		session.close();}
		
	}

	@Override
	public Book getBook(int id) throws SQLException {
		Book result = null;
		Session session = null;
		try{
			session = HibernateUtil.getInstance().openSession();
			result =(Book) session.get(Book.class, id);
		}
		catch(Exception e){e.printStackTrace();}
		finally{
			if (session != null && session.isOpen())
		session.close();}
		
		
		return result;
	}

	@Override
	public List<Book> getBooks() throws SQLException {
		List<Book> books = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getInstance().openSession();
			books = session.createCriteria(Book.class).list();
		}
		catch(Exception e){e.printStackTrace();}
		finally{
			if (session != null && session.isOpen())
		session.close();}
		
		return books;
	}
	
}
