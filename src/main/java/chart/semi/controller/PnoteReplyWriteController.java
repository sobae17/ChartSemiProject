package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.PnoteReplyWriteVo;
import chart.semi.service.ChartService;

/**
 * Servlet implementation class PnoteReplyWriteController
 */
@WebServlet("/my/reply/write.ajax")
public class PnoteReplyWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChartService service = new ChartService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PnoteReplyWriteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/my/reply/write.ajax dopost()");
		String chartId = request.getParameter("chartId");
		String patientId = request.getParameter("patientId");
		String clientId = request.getParameter("clientId");
		String pnoteReplay = request.getParameter("pnoteReplay");
		
		PnoteReplyWriteVo vo = new PnoteReplyWriteVo(chartId,patientId,clientId,pnoteReplay);
		System.out.println("vo");
		int result = service.insertClientReplay(vo);
	}

}
