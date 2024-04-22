package chart.semi.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ClientDao;
import chart.semi.model.dao.ClientInfoDao;
import chart.semi.model.vo.ClientInfoVo;
import chart.semi.model.vo.ClientVo;

public class ClientInfoService {
	private ClientInfoDao dao = new ClientInfoDao();
	// select list - all
		public List<ClientInfoVo> selectAllList() {
			List<ClientInfoVo> result = null;
			SqlSession session = getSqlSession(true);
			result = dao.selectAllList(session); 
			session.close();
			return result;
		}

		// select one
		public ClientInfoVo selectOne(String patientId) {
			ClientInfoVo result = null;
			SqlSession session = getSqlSession(true);
			result = dao.selectOne(session, patientId);
			session.close();
			return result;
		}
		// insert
		public int insert(ClientInfoVo vo) {
			int result = 0;
			SqlSession session = getSqlSession(true);
			result = dao.insert(session, vo);
			session.close();
			return result;
		}
		// update
		public int update(ClientInfoVo vo) {
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
