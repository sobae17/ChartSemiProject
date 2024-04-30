package chart.semi.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.StaffChartWriteVo;
import chart.semi.model.vo.StaffVo;
import chart.semi.service.ChartService;
import chart.semi.service.PatientService;

/**
 * Servlet implementation class WriteController
 */
@WebServlet("/staff/write")
public class StaffChartWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChartService service =  new ChartService();
	private PatientService servicePatient =  new PatientService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffChartWriteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pvolist", servicePatient.selectAllPatientIdName());
		request.getRequestDispatcher("/WEB-INF/views/staff_write.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String patuentId = request.getParameter("patuentId");
		String ptitle = request.getParameter("ptitle");
		String pnote = request.getParameter("pnote");
		String staffId = request.getParameter("staffId");
		// 스태프 로그인 
		//		StaffVo sssloginStaff = (StaffVo)request.getSession().getAttribute("sssloginStaff");
		StaffVo sssloginStaff = (StaffVo)request.getSession().getAttribute("sssloginStaff");
		System.out.println("ptitle");
		System.out.println("pnote");
		
	//	StaffChartWriteVo vo = new StaffChartWriteVo(patuentId, ptitle, pnote, staffId);
		//int sequenceNum = service.insertStaffWrite(vo);
	//	response.sendRedirect(request.getContextPath()+"/board/list?num="+sequenceNum);
	}
}
