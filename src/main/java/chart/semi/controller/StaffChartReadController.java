package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.ChartReadReqVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.model.vo.StaffVo;
import chart.semi.service.ChartService;

/**
 * Servlet implementation class ChartSemiReadController
 */
@WebServlet("/staff/read")
public class StaffChartReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChartService service = new ChartService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffChartReadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chartId = request.getParameter("id");
		String patientId = request.getParameter("pid");
		ChartReadReqVo vo = new ChartReadReqVo(chartId, patientId);
		request.setAttribute("dto", service.selectRead(vo));
		request.getRequestDispatcher("/WEB-INF/views/Staff_read.jsp").forward(request, response);
			
			
	}

}
