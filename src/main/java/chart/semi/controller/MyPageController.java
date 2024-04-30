package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.ChartReadReqVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.service.ChartService;
import chart.semi.service.ClientInfoService;

/**
 * Servlet implementation class ChartJoinController
 */
@WebServlet("/my/mypage")
public class MyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClientInfoService service = new ClientInfoService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyPageController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.setAttribute("cvolist", service.selectAllList());
		request.getRequestDispatcher("/WEB-INF/views/MyPage.jsp").forward(request, response);

//		String chartId = request.getParameter("id");
//		ChartReadReqVo vo = new ChartReadReqVo(chartId,
//				((ClientLoginResVo) request.getSession().getAttribute("ssslogin")).getPatientId());
	}
}
