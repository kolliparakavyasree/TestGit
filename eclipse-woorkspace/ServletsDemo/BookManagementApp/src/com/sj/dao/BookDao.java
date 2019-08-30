package com.sj.dao;

import java.sql.SQLException;
import java.util.Collection;

import com.sj.model.Book;

public interface BookDao {
	
	public Book insertBook(Book book);
	public Collection<Book> getAllBooks();
	public Book getBookById(int id) throws SQLException;
	public Boolean updateBook(int id,double price) throws SQLException;
	public Boolean deleteBook(int id) throws SQLException;
}
