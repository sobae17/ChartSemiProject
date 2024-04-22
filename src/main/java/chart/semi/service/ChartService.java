package chart.semi.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ChartDao;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.ClientVo;

public class ChartService {
	private ChartDao dao = new ChartDao(); 
	
	// select list - all
	public List<ChartVo> selectAllList() {
		List<ChartVo> result = null;
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