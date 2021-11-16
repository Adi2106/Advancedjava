package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class BookStore
 */
@WebServlet("/BookStore")
public class BookStore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookStore() {
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
		String s = request.getParameter("buy");		
		if(s.equalsIgnoreCase("BuyDaa"))
		{
			out.println("Successfully Purchased DAA Book");
		}
		else if(s.equalsIgnoreCase("BuyJava"))
		{
			out.println("Successfully Purchased JAVA Book");
		
		}
		else if(s.equalsIgnoreCase("BuyPython"))
		{
			out.println("Successfully Purchased Python Book");
		}
		else if(s.equalsIgnoreCase("BuyC++"))
		{
			out.println("Successfully Purchased C++ Book");
		}
		else if(s.equalsIgnoreCase("BuyC"))
		{
			out.println("Successfully Purchased C Book");
		}
		else
		{
			out.println("Invalid Choice!");
		}		
	}
}
