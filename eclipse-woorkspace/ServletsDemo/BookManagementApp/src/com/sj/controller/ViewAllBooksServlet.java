package com.sj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sj.dao.BookDao;
import com.sj.dao.BookDaoImpl;
import com.sj.model.Book;

/**
 * Servlet implementation class ViewAllBooksServlet
 */
@WebServlet("/ViewAllBooks")
public class ViewAllBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDao dao;
	
	public void init() {
		this.dao = new BookDaoImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Collection<Book> books = dao.getAllBooks();
//		Iterator<Book> it = books.iterator();
//		while(it.hasNext()) {
		for(Book b:books) {
//			out.println("Book details: <br> Book Id: "+it.next().getId()+"<br> Book Name: "+it.next().getTitle()+"<br> Book Author: "+it.next().getAuthor()+"<br> Price: "+it.next().getPrice()+"</br>");
			out.println("Book details: <br> Book Id: "+b.getId()+"<br> Book Name: "+b.getTitle()+"<br> Book Author: "+b.getAuthor()+"<br> Price: "+b.getPrice()+"</br></br>");
	}	

	}

}
