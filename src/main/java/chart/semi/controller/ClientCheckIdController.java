package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.service.ClientService;

/**
 * Servlet implementation class ClientCheckIdController
 */
@WebServlet("/checkid.ajax")
public class ClientCheckIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClientService service = new ClientService();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientCheckIdController() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result = 0;
		String clientId = request.getParameter("cid");
		if(clientId == null) {
			result = 2; // req 데이터가 없어서 오류 
		}else {
			result = service.selectOneCheckId(clientId);
		}
		response.getWriter().append(String.valueOf(result));
	}

}
