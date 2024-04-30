package chart.semi.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ChartDao;
import chart.semi.model.dao.StaffDao;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.ClientVo;
import chart.semi.model.vo.StaffReqVo;
import chart.semi.model.vo.StaffVo;

public class StaffService {
	private StaffDao dao = new StaffDao(); 
	
	// select list - all
	public List<StaffVo> selectAllList() {
		List<StaffVo> result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectAllList(session); 
		session.close();
		return result;
	}

	// select loginone
	public StaffReqVo selectOneLogin(String staffId) {
		StaffReqVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOneLogin(session, staffId);
		session.close();
		return result;
	}
	// select one
	public StaffVo selectOne(String staffId) {
		StaffVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOne(session, staffId);
		session.close();
		return result;
	}
	// insert
	public int insert(StaffVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insert(session, vo);
		session.close();
		return result;
	}
	// update
	public int update(StaffVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.update(session, vo);
		session.close();
		return result;
	}
	// delete
	public int delete(String staffId) {
		int result = 0;
		SqlSession session = null;
		result = dao.delete(session, staffId);
		session.close();
		return result;
}
}