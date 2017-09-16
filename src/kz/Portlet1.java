package kz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Portlet1
 */
public class Portlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Portlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("  <b><a href=\"Portlet1\">portlet1</a></b> served at: ").append(request.getContextPath());
//		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/Portlet2");
//		rd.include(request, response);
//		sessionInfo(request, response);
	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//	
//public void sessionInfo(HttpServletRequest request, HttpServletResponse response)throws IOException {
//		
//		response.getWriter().append("  Session: "+request.getSession().getAttribute("mname"));
//		response.getWriter().append("  Session: "+request.getParameter("mname"));
//	}

}
