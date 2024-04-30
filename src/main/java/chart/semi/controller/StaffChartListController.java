package chart.semi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import chart.semi.model.vo.ChartListVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.model.vo.HealthChartReadVo;
import chart.semi.model.vo.StaffChartListVo;
import chart.semi.model.vo.StaffVo;
import chart.semi.service.ChartService;
import chart.semi.service.PatientService;

/**
 * Servlet implementation class ReadListController
 */
@WebServlet("/staff/list")
public class StaffChartListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PatientService service = new PatientService();
	private ChartService serviceChart = new ChartService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffChartListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pvolist", service.selectAllPatientIdName());
		request.getRequestDispatcher("/WEB-INF/views/staff_list.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ajax
		String patientId = request.getParameter("patientId");
		if(patientId == null || patientId.equals("")) {
			response.getWriter().append("-1");
		}
		List<StaffChartListVo> result =serviceChart.selectChartByPatientId(patientId);
		response.getWriter().append(new Gson().toJson(result));
	}
}