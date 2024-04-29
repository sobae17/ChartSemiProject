package chart.semi.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ChartDao;
import chart.semi.model.dao.HealthChartDao;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.ClientVo;
import chart.semi.model.vo.HealthChartReadVo;
import chart.semi.model.vo.HealthChartVo;

public class HealthChartService {
	private HealthChartDao dao = new HealthChartDao(); 
	
	// select list - all
	public List<HealthChartVo> selectAllList() {
		List<HealthChartVo> result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectAllList(session); 
		session.close();
		return result;
	}

	// select one
	public HealthChartReadVo selectOneLast(String patientId) {
		HealthChartReadVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOneLast(session, patientId);
		session.close();
		return result;
	}
	// select one
	public HealthChartVo selectOne(String chartId) {
		HealthChartVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOne(session, chartId);
		session.close();
		return result;
	}
	// insert
	public int insert(HealthChartVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insert(session, vo);
		session.close();
		return result;
	}
	// update
	public int update(HealthChartVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.update(session, vo);
		session.close();
		return result;
	}
	// delete
	public int delete(String chartId) {
		int result = 0;
		SqlSession session = null;
		result = dao.delete(session, chartId);
		session.close();
		return result;
}
}