package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.ChartReadReqVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.model.vo.HealthChartVo;
import chart.semi.service.HealthChartService;

/**
 * Servlet implementation class HealthController
 */
@WebServlet("/my/health")
public class HealthController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private HealthChartService service = new HealthChartService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chartId = request.getParameter("id");
		// ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId() ==> 
		HealthChartReadVo vo = new HealthChartVo(patientId, ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId());
		request.setAttribute("dto", service.selectOne(vo));
		request.getRequestDispatcher("/WEB-INF/views/health_chart.jsp").forward(request, response);
			
}
}