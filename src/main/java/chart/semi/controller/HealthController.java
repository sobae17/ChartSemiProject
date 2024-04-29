package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import chart.semi.model.vo.ChartReadReqVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.model.vo.HealthChartReadReqVo;
import chart.semi.model.vo.HealthChartReadVo;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId()
		// ==> 로그인정보
		HealthChartReadVo result = service
				.selectOneLast(((ClientLoginResVo) request.getSession().getAttribute("ssslogin")).getPatientId());
		request.setAttribute("vo", result);
		request.getRequestDispatcher("/WEB-INF/views/health_chart.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ajax 로 날짜 변경시
		String healthDate = request.getParameter("healthDate");
		// ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId()
		// ==> 로그인정보
		HealthChartReadReqVo param = new HealthChartReadReqVo(healthDate, ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId());
		HealthChartReadVo result = service.selectOneDate(param);
		response.getWriter().append(new Gson().toJson(result));
		
	}
}