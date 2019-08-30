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
 * Servlet implementation class UpdataBookServlet
 */
@WebServlet("/UpdataBook")
public class UpdataBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDao dao;
	
	public void init() {
		this.dao = new BookDaoImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdataBookServlet() {
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
		double price = Integer.parseInt(request.getParameter("price"));
		try {
			Boolean bool = dao.updateBook(id, price);
			if(bool) {
				out.println("Book price updated");
			}else {
				out.println("Book price not updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
