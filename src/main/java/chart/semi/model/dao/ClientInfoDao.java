package chart.semi.model.dao;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.*;

public class ClientInfoDao  {
		// select list - all
			public List<ClientInfoVo> selectAllList(SqlSession session) {
				return session.selectList("chartMapper.selectAllList");
			}

			// select one 
			public ClientInfoVo selectOne(SqlSession session, String patientId) {
				return session.selectOne("chartMapper.selectOne", patientId );
			}

			// insert
			public int insert(SqlSession session, ClientInfoVo vo) {
				return session.insert("chartMapper.insert", vo);
			}

			// update
			public int update(SqlSession session, ClientInfoVo vo) {
				return session.update("chartMapper.update", vo);
			}

			// delete
			public int delete(SqlSession session, String patientId) {
				return session.delete("chartMapper.delete", patientId);
			}

		}