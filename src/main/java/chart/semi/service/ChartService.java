package chart.semi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ChartDao;
import chart.semi.model.vo.ChartListVo;
import chart.semi.model.vo.ChartReadReqVo;
import chart.semi.model.vo.ChartReadVo;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.StaffChartWriteVo;
import chart.semi.model.vo.StaffVo;

public class ChartService {
	private ChartDao dao = new ChartDao(); 

	// select list - page
	public Map<String, Object> selectStaffPage(int pageSize, int pageBlockSize, int currentPageNum, String staffId) {
		Map<String, Object> result = null;
		List<ChartListVo> dtolist = null;
		int totalCount = 0;
		SqlSession session = getSqlSession(true);
		
		System.out.println("currentPageNum: " +currentPageNum);
		int start = pageSize*(currentPageNum-1)+1;
		int end = pageSize*currentPageNum;
		
//			--- 총글개수 103
//			select count(*) cnt from board;
		totalCount = dao.selectTotalCount(session, staffId);
		System.out.println("totalCount:"+totalCount);
//			-- 전체페이지수  = ceil(총글개수/한페이지당글수) = (총글개수%한페이지당글수== 0)?(총글개수/한페이지당글수):(총글개수/한페이지당글수+1) 
//			int totalPageCount = (int)Math.ceil(totalCount/(double)pageSize);
		int totalPageCount = (totalCount % pageSize == 0)? totalCount/pageSize :  totalCount/pageSize+1;
		
//			-- 시작페이지 startPageNum = (현재페이지%페이지수 == 0) ? ((현재페이지/페이지수)-1)*페이지수 + 1  :((현재페이지/페이지수))*페이지수 + 1
//			-- 끝페이지 endPageNum =  (endPageNum > 전체페이지수) ? 전체페이지수 : startPageNum+페이지수 - 1;
		int startPageNum = (currentPageNum%pageBlockSize == 0) ? ((currentPageNum/pageBlockSize)-1)*pageBlockSize + 1  :((currentPageNum/pageBlockSize))*pageBlockSize + 1;
		int endPageNum = (startPageNum+pageBlockSize > totalPageCount) ? totalPageCount : startPageNum+pageBlockSize-1;
		
		dtolist = dao.selectPageList(session, start, end, staffId);
		session.close();
//			System.out.println("서비스");
//			
		result = new HashMap<String, Object>();
		result.put("dtolist", dtolist);
		result.put("totalPageCount", totalPageCount);
		result.put("startPageNum", startPageNum);
		result.put("endPageNum", endPageNum);
		result.put("currentPageNum", currentPageNum);
		System.out.println("selectPageList() : "+result);
		return result;
	}
	// select list - page
	public Map<String, Object> selectPageList(int pageSize, int pageBlockSize, int currentPageNum, String patientId) {
		Map<String, Object> result = null;
		List<ChartListVo> dtolist = null;
		int totalCount = 0;
		SqlSession session = getSqlSession(true);
		
		System.out.println("currentPageNum: " +currentPageNum);
		int start = pageSize*(currentPageNum-1)+1;
		int end = pageSize*currentPageNum;
		
//			--- 총글개수 103
//			select count(*) cnt from board;
		totalCount = dao.selectTotalCount(session, patientId);
		System.out.println("totalCount:"+totalCount);
//			-- 전체페이지수  = ceil(총글개수/한페이지당글수) = (총글개수%한페이지당글수== 0)?(총글개수/한페이지당글수):(총글개수/한페이지당글수+1) 
//			int totalPageCount = (int)Math.ceil(totalCount/(double)pageSize);
		int totalPageCount = (totalCount % pageSize == 0)? totalCount/pageSize :  totalCount/pageSize+1;
		
//			-- 시작페이지 startPageNum = (현재페이지%페이지수 == 0) ? ((현재페이지/페이지수)-1)*페이지수 + 1  :((현재페이지/페이지수))*페이지수 + 1
//			-- 끝페이지 endPageNum =  (endPageNum > 전체페이지수) ? 전체페이지수 : startPageNum+페이지수 - 1;
		int startPageNum = (currentPageNum%pageBlockSize == 0) ? ((currentPageNum/pageBlockSize)-1)*pageBlockSize + 1  :((currentPageNum/pageBlockSize))*pageBlockSize + 1;
		int endPageNum = (startPageNum+pageBlockSize > totalPageCount) ? totalPageCount : startPageNum+pageBlockSize-1;
		
		dtolist = dao.selectPageList(session, start, end, patientId);
		session.close();
//			System.out.println("서비스");
//			
		result = new HashMap<String, Object>();
		result.put("dtolist", dtolist);
		result.put("totalPageCount", totalPageCount);
		result.put("startPageNum", startPageNum);
		result.put("endPageNum", endPageNum);
		result.put("currentPageNum", currentPageNum);
		System.out.println("selectPageList() : "+result);
		return result;
	}
	// select list - page
	public List<ChartListVo> selectPageListMybatis(int pageSize, int pageBlockSize, int currentPageNum, String patientId ) {
		List<ChartListVo> result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectPageListRowBounds(session, pageSize, currentPageNum, patientId);
		session.close();
		return result;
	}
	// select list - all
	public List<ChartListVo> selectAllList() {
		List<ChartListVo> result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectAllList(session); 
		session.close();
		return result;
	}

	// select one
	public ChartVo selectOne(String clientId) {
		ChartVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOne(session, clientId);
		session.close();
		return result;
	}
	
	// select one
	public ChartReadVo selectRead(ChartReadReqVo vo) {
		ChartReadVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectRead(session, vo);
		session.close();
		return result;
	}
	
	// insert
	public int insertStaffWrite(StaffChartWriteVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insertStaffWrite(session, vo);
		session.close();
		return result;
	}
	// insert
	public int insert(ChartVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insert(session, vo);
		session.close();
		return result;
	}
	// update
	public int update(ChartVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.update(session, vo);
		session.close();
		return result;
	}
	// delete
	public int delete(String clientId) {
		int result = 0;
		SqlSession session = null;
		result = dao.delete(session, clientId);
		session.close();
		return result;
}
}