package CalculatorServProject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1>Calculator!!</h1>");
		int a = Integer.parseInt(request.getParameter("n1"));
		int b = Integer.parseInt(request.getParameter("n2"));
		String choice = request.getParameter("cal");
		if(choice.equalsIgnoreCase("add"))
		{
			int c= a+b;
			out.println("<h3>Addition is : "+c+"</h3>");
		}
		else if(choice.equalsIgnoreCase("sub"))
		{
			int c= a-b;
			out.println("<h3>Substraction is : "+c+"</h3>");
		}
		else if(choice.equalsIgnoreCase("mul"))
		{
			int c= a*b;
			out.println("<h3>Multiplication is : "+c+"</h3>");
		}
		else if(choice.equalsIgnoreCase("div"))
		{
			int c= a/b;
			out.println("<h3>Division is : "+c+"</h3>");
		}
		else
		{
			out.println("Invalid Choice Operation!!");
		}
	}
}
