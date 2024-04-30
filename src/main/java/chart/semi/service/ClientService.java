package chart.semi.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ClientDao;
import chart.semi.model.vo.ClientInfoVo;
import chart.semi.model.vo.ClientLoginReqVo;
import chart.semi.model.vo.ClientLoginResVo;
import chart.semi.model.vo.ClientVo;

public class ClientService {
	private ClientDao dao = new ClientDao();

		// select list - all
		public List<ClientVo> selectAllList() {
			List<ClientVo> result = null;
			SqlSession session = getSqlSession(true);
			result = dao.selectAllList(session); 
			session.close();
			return result;
		}

		// select one
		public ClientLoginResVo selectLogin(ClientLoginReqVo vo) {
			ClientLoginResVo result = null;
			SqlSession session = getSqlSession(true);
			result = dao.selectLoginOne(session, vo);
			session.close();
			return result;
		}
		// select one 
		public int selectOneCheckId(String clientId) {
			int result = 0;
			SqlSession session = getSqlSession(true);
			result = dao.selectOneCheckId(session, clientId);
			session.close();
			return result;
		}
		// select one
		public ClientVo selectOne(String clientId) {
			ClientVo result = null;
			SqlSession session = getSqlSession(true);
			result = dao.selectOne(session, clientId);
			session.close();
			return result;
		}
		// insert
		public int insert(ClientVo vo) {
			int result = 0;
			SqlSession session = getSqlSession(true);
			result = dao.insert(session, vo);
			session.close();
			return result;
		}
		// update
		public int update(ClientVo vo) {
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
