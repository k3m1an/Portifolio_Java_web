package unidade2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet(description = "Este � o primeiro servlet", urlPatterns = { "/PrimeiroServlet" })
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int acessos = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		acessos++;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Servlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.print("Esta � a ");
		out.print(this.getClass());
		out.println(" usando o m�todo GET, com o numero de acessos = "+acessos);
		out.println(" </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
