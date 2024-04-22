package chart.semi.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.StaffVo;



public class StaffDao {
	// select list - all
				public List<StaffVo> selectAllList(SqlSession session) {
					return session.selectList("chartMapper.selectAllList");
				}

				// select one 
				public StaffVo selectOne(SqlSession session, String staffId) {
					return session.selectOne("chartMapper.selectOne", staffId );
				}

				// insert
				public int insert(SqlSession session, StaffVo vo) {
					return session.insert("chartMapper.insert", vo);
				}

				// update
				public int update(SqlSession session, StaffVo vo) {
					return session.update("chartMapper.update", vo);
				}

				// delete
				public int delete(SqlSession session, String staffId) {
					return session.delete("chartMapper.delete", staffId);
				}

			}