package com.sj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.sj.model.Book;

public class BookDaoImpl implements BookDao{
	
	Connection connection;
	
	public BookDaoImpl() {
		try {
			connection = DBConnector.getConnector().getConnection(); 
	
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Book insertBook(Book book) {
		// TODO Auto-generated method stub
		
		try {
			Statement st = connection.createStatement();
			int n = st.executeUpdate("insert into books values("+book.getId()+",'"+book.getTitle()+"','"+book.getAuthor()+"',"+book.getPrice()+");");
//			System.out.println("insert into books values("+book.getId()+",'"+book.getTitle()+"','"+book.getAuthor()+"',"+book.getPrice()+");");
			if(n==1) {
				return book;
			}else {
				return null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public Collection<Book> getAllBooks() {
		Collection<Book> books = new ArrayList<Book>();
		Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from books");
			while(rs.next()) {
				Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
				books.add(book);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book getBookById(int id) throws SQLException {
		
			PreparedStatement pst = connection.prepareStatement("select * from books where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			rs.next();
		
		Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));		
		return book;
	}

	@Override
	public Boolean updateBook(int id, double price) throws SQLException {
		// TODO Auto-generated method stub
		Statement st = connection.createStatement();
		int n = st.executeUpdate("update books set price ="+price+" where id ="+id);
		if(n==1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Boolean deleteBook(int id) throws SQLException {
		// TODO Auto-generated method stub
		Statement st = connection.createStatement();
		int n = st.executeUpdate("delete from books where id ="+id);
		if(n==1) {
			return true;
		}else {
			return false;
		}
	}

}
