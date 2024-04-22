package chart.semi.model.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.*;


public class ClientDao {
	// select list - all
		public List<ClientVo> selectAllList(SqlSession session) {
			return session.selectList("chartMapper.selectAllList");
		}

		// select one 
		public ClientVo selectOne(SqlSession session, String clientId) {
			return session.selectOne("chartMapper.selectOne", clientId );
		}

		// insert
		public int insert(SqlSession session, ClientVo vo) {
			return session.insert("chartMapper.insert", vo);
		}

		// update
		public int update(SqlSession session, ClientVo vo) {
			return session.update("chartMapper.update", vo);
		}

		// delete
		public int delete(SqlSession session, String clientId) {
			return session.delete("chartMapper.delete", clientId);
		}

	}
