package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import chart.semi.model.vo.ClientVo;
import chart.semi.service.ClientService;

/**
 * Servlet implementation class ChartJoinController
 */
@WebServlet("/join")
public class ChartJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChartJoinController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기여기");
		String clientId = request.getParameter("id");
		String clientPwd = request.getParameter("pwd");
		String clientEmail = request.getParameter("email");
		String patientId = request.getParameter("patientId");
		
		ClientVo vo = new ClientVo(clientId, clientPwd, clientEmail,patientId);
		System.err.println(vo);
		int result = new ClientService().insert(vo);
		if(result < 0 ) {
			// 회원가입실패시
			// TODO
			response.sendRedirect(request.getContextPath()+"/join");
			return;
		}
		// 회원가입정상
		response.sendRedirect(request.getContextPath()+"/login");
	
}
}
