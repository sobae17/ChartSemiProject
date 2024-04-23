package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.PatientCheckReqVo;
import chart.semi.service.PatientService;

/**
 * Servlet implementation class PatientCheckIdController
 */
@WebServlet("/checkpatient.ajax")
public class PatientCheckIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PatientService service  = new PatientService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientCheckIdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String patientNo = request.getParameter("patientNo");
		String patientName = request.getParameter("patientName");
		PatientCheckReqVo vo = new PatientCheckReqVo(patientName, patientNo);
		String patientId = service.selectOneCheckPatient(vo);
		System.out.println(patientId);
		response.getWriter().append(patientId);
	}

}
