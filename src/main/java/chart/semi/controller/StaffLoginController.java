package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.ClientLoginReqVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.service.ClientService;

/**
 * Servlet implementation class ChartLoginController
 */
@WebServlet("/login")
public class StaffLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClientService service = new ClientService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		ClientLoginReqVo vo = new ClientLoginReqVo(id, pwd);
		System.out.println("vo: "+ vo);
		ClientLoginResVo resVo = service.selectLogin(vo);
		if(resVo != null) {
			// 로그인 정보를 Session 등록
			request.getSession().setAttribute("ssslogin", resVo);
			System.out.println("로그인 성공");
			response.getWriter().append("1");
		} else {
			System.out.println("로그인 실패");
			response.getWriter().append("0");
		}
	}
}
