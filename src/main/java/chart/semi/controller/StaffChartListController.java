package chart.semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chart.semi.model.vo.ChartListVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.model.vo.HealthChartReadVo;
import chart.semi.model.vo.StaffVo;
import chart.semi.service.ChartService;

/**
 * Servlet implementation class ReadListController
 */
@WebServlet("/staff/list")
public class StaffChartListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChartService service = new ChartService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffChartListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				-- 한페이지당글수 3 씩
		int pageSize = 3;
//		-- 화면하단 나타날 페이지수 5 씩
		int pageBlockSize = 5;
//		-- 현재페이지
		int currentPageNum = 1;  // 기본1
		// 페이지지정하고 들어왔다면... 현재페이지를 그값으로 설정함
		String pageNum = request.getParameter("page");
		if(pageNum!= null && !pageNum.equals("")) {
			try {
				currentPageNum = Integer.parseInt(pageNum);
			}catch(NumberFormatException e) {
				System.out.println("!!!!!!!!!!!!!! NumberFormatException !!!!!!");
				//e.printStackTrace();
			}
		}
		StaffVo sssloginStaff = (StaffVo)request.getSession().getAttribute("sssloginStaff");
		request.setAttribute("pagemap" , service.selectStaffPage(pageSize, pageBlockSize, currentPageNum, sssloginStaff.getStaffId()));
//		request.setAttribute("dtolist", service.selectAllList());
		
		
		request.getRequestDispatcher("/WEB-INF/views/staff_list.jsp").forward(request, response);
	}
}