package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Basic
 */
@WebServlet("/Basic")
public class Basic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Basic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession sess = request.getSession();
		String u = request.getParameter("t1");
		String p = request.getParameter("t2");
		sess.setAttribute("user", u);
		sess.setAttribute("pass", p);
		response.sendRedirect("http://localhost:8080/Session_Tracking_Methods/Basic2");
		if(sess.isNew())
		{
			out.println("Session Created!");
			out.println("SessionId: "+sess.getId());
		}
		else
		{
			out.println("Existing User"+ sess.getId());
			out.println(sess.getCreationTime());
			out.println(sess.getLastAccessedTime());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
