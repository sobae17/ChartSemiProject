package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.StaffReqVo;
import chart.semi.model.vo.StaffVo;
import chart.semi.service.StaffService;

/**
 * Servlet implementation class ChartLoginController
 */
@WebServlet("/stafflogin")
public class StaffChartLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StaffService service = new StaffService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StaffChartLoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/staff_login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String staffId = request.getParameter("staffId");
		String staffPwd = request.getParameter("staffPwd");

		StaffReqVo vo = new StaffReqVo(staffId, staffPwd);
		System.out.println("vo: " + vo);
		StaffVo resVo = service.selectOneLogin(vo);
		;
		
		if(resVo != null) {
			// 로그인 정보를 Session 등록
			request.getSession().setAttribute("sssloginStaff", resVo);
			System.out.println("로그인 성공");
			response.getWriter().append("1");
		} else {
			System.out.println("로그인 실패");
			response.getWriter().append("0");
		}
	}
}
		
