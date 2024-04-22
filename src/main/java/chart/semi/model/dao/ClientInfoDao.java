package chart.semi.model.dao;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.*;

public class ClientInfoDao  {
		// select list - all
			public List<ClientInfoVo> selectAllList(SqlSession session) {
				return session.selectList("clientInfoMapper.selectAllList");
			}

			// select one 
			public ClientInfoVo selectOne(SqlSession session, String patientId) {
				return session.selectOne("clientInfoMapper.selectOne", patientId );
			}

			// insert
			public int insert(SqlSession session, ClientInfoVo vo) {
				return session.insert("clientInfoMapper.insert", vo);
			}

			// update
			public int update(SqlSession session, ClientInfoVo vo) {
				return session.update("clientInfoMapper.update", vo);
			}

			// delete
			public int delete(SqlSession session, String patientId) {
				return session.delete("clientInfoMapper.delete", patientId);
			}

		}