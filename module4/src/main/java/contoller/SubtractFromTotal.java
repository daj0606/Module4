package contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetTotal;

/**
 * Servlet implementation class SubtractFromTotal
 */
@WebServlet("/subtractFromTotal")
public class SubtractFromTotal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubtractFromTotal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userText1 = request.getParameter("subtractionNum1");
		String userText2 = request.getParameter("subtractionNum2");
		GetTotal total = new GetTotal(userText1, userText2);
		double outText = total.Subtraction();
		
		PrintWriter writer = response.getWriter();
		writer.println("Subtracted Numbers: " + outText);
		writer.close();
	}

}
