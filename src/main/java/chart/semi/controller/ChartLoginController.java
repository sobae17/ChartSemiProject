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
public class ChartLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StaffService service = new StaffService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChartLoginController() {
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

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		StaffReqVo vo = new StaffReqVo(id, pwd);
		System.out.println("vo: " + vo);
		/* StaffVo resVo = service.selectOne(vo); */
//		ajax
//		성공: 1
//		실패: 0
		int result = 0;
		StaffVo resultInfo = service.selectOneLogin(vo);
		if (vo != null) {
			// 로그인 정보를 Session 등록
			request.getSession().setAttribute("sssloginStaff", resultInfo);
			result = 1;
			System.out.println("로그인 성공");
		} 
		response.getWriter().append(String.valueOf(result));
		
		
//		/*else {
//			System.out.println("로그인 실패");
//			response.getWriter().append("0");*/
//		}
		
	}
}
