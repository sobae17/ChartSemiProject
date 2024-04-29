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

/**
 * Servlet implementation class ChartSemiReadController
 */
@WebServlet("/my/read")
public class ChartReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChartService service = new ChartService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChartReadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chartId = request.getParameter("id");
		// ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId() ==> 로그인한 정보의 getter
		ChartReadReqVo vo = new ChartReadReqVo(chartId, ((ClientLoginResVo)request.getSession().getAttribute("ssslogin")).getPatientId());
		request.setAttribute("dto", service.selectRead(vo));
		request.getRequestDispatcher("/WEB-INF/views/read.jsp").forward(request, response);
			
			
	}

}
