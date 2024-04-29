package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.service.ChartService;

/**
 * Servlet implementation class ChartSemiReadController
 */
@WebServlet("/my/read")
public class ChartReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChartService serive = new ChartService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChartReadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chartIdstr = request.getParameter("id");
		try {
			int chartId = Integer.parseInt(chartIdstr);
			request.setAttribute("dto", serive.selectRead(chartId));
			request.getRequestDispatcher("/WEB-INF/views/read.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			System.out.println("!!!NumberFormatException");
			response.sendRedirect(request.getContextPath()+"chart/list");
			
			
		}
	}

}
