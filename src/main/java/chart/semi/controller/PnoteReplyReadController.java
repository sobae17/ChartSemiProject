package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import chart.semi.model.vo.PnoteReplyWriteVo;
import chart.semi.service.ChartService;
import chart.semi.service.PnoteCommentService;

/**
 * Servlet implementation class PnoteReplyWriteController
 */
@WebServlet("my/reply/read.ajax")
public class PnoteReplyReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PnoteCommentService service = new PnoteCommentService();
	

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PnoteReplyReadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/my/reply/write.ajax dopost()");
		String chartId= request.getParameter("chartId");
		String patientId= request.getParameter("patientId");
		String pnoteReplay= request.getParameter("pnoteReplay");
		String pnoteRep= request.getParameter("pnoteRep");
		response.getWriter().append(new Gson().toJson(service.selectAllList(chartId,patientId,pnoteReplay,pnoteRep )));
	}
}
