package chart.semi.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.PatientCheckReqVo;
import chart.semi.model.vo.PatientIdNameVo;
import chart.semi.model.vo.PatientVo;



public class PatientDao {
	// select one 
	public String selectOneCheckPatient(SqlSession session, PatientCheckReqVo vo) {
		System.out.println(vo);
		return session.selectOne("patientMapper.selectOneCheckPatient", vo );
	}

	
	// select list - all
	public List<PatientIdNameVo> selectAllPatientIdName(SqlSession session) {
		return session.selectList("patientMapper.selectAllPatientIdName");
	}
	// select list - all
	public List<PatientVo> selectAllList(SqlSession session) {
		return session.selectList("patientMapper.selectAllList");
	}

	// select one 
	public PatientVo selectOne(SqlSession session, String patientId) {
		return session.selectOne("patientMapper.selectOne", patientId );
	}

	// insert
	public int insert(SqlSession session, PatientVo vo) {
		return session.insert("patientMapper.insert", vo);
	}

	// update
	public int update(SqlSession session, PatientVo vo) {
		return session.update("patientMapper.update", vo);
	}

	// delete
	public int delete(SqlSession session, String patientId) {
		return session.delete("patientMapper.delete", patientId);
	}

}