package whw.chapter4.servletRequest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lineServlet
 */
public class lineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String methodeString=request.getMethod();
		System.out.println(methodeString);
		String uriString=request.getRequestURI();
		System.out.println(uriString);
		StringBuffer urlString=request.getRequestURL();
		System.out.println(urlString);
		String protocalString=request.getProtocol();
		System.out.println(protocalString);
		String projectString=request.getContextPath();
		System.out.println(projectString);
		String servletString=request.getServletPath();
		System.out.println(servletString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
