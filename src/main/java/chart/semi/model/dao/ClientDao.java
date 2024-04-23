package chart.semi.model.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.*;


public class ClientDao {
	// select list - all
		public List<ClientVo> selectAllList(SqlSession session) {
			return session.selectList("clientMapper.selectAllList");
		}

		// select one 
		public ClientLoginResVo selectLoginOne(SqlSession session, ClientLoginReqVo vo) {
			return session.selectOne("clientMapper.selectLoginOne", vo );
		}
		// select one 
		public int selectOneCheckId(SqlSession session, String clientId) {
			return session.selectOne("clientMapper.selectOneCheckId", clientId );
		}
		// select one 
		public ClientVo selectOne(SqlSession session, String clientId) {
			return session.selectOne("clientMapper.selectOne", clientId );
		}

		// insert
		public int insert(SqlSession session, ClientVo vo) {
			return session.insert("clientMapper.insert", vo);
		}

		// update
		public int update(SqlSession session, ClientVo vo) {
			return session.update("clientMapper.update", vo);
		}

		// delete
		public int delete(SqlSession session, String clientId) {
			return session.delete("clientMapper.delete", clientId);
		}

	}
