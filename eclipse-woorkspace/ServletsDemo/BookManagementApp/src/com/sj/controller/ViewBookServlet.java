package com.sj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sj.dao.BookDao;
import com.sj.dao.BookDaoImpl;
import com.sj.model.Book;

/**
 * Servlet implementation class ViewBookServlet
 */
@WebServlet("/ViewBook")
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDao dao;
	
	public void init() {
		this.dao = new BookDaoImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBookServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Book book = dao.getBookById(id);
			System.out.println(book);
			out.println("Book details: <br> Book Id: "+book.getId()+"<br> Book Name: "+book.getTitle()+"<br> Book Author: "+book.getAuthor()+"<br> Price: "+book.getPrice());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
