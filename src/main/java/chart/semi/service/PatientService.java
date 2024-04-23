package chart.semi.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ChartDao;
import chart.semi.model.dao.PatientDao;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.ClientVo;
import chart.semi.model.vo.PatientCheckReqVo;
import chart.semi.model.vo.PatientVo;

public class PatientService {
	private PatientDao dao = new PatientDao(); 
	
	// select one
	public String selectOneCheckPatient(PatientCheckReqVo vo) {
		String result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOneCheckPatient(session, vo);
		session.close();
		return result;
	}
	
	
	
	
	// select list - all
	public List<PatientVo> selectAllList() {
		List<PatientVo> result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectAllList(session); 
		session.close();
		return result;
	}

	// select one
	public PatientVo selectOne(String patientId) {
		PatientVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOne(session, patientId);
		session.close();
		return result;
	}
	
	// insert
	public int insert(PatientVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insert(session, vo);
		session.close();
		return result;
	}
	// update
	public int update(PatientVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.update(session, vo);
		session.close();
		return result;
	}
	// delete
	public int delete(String patientId) {
		int result = 0;
		SqlSession session = null;
		result = dao.delete(session, patientId);
		session.close();
		return result;
}
}