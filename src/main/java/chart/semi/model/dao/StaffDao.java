package chart.semi.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.StaffVo;



public class StaffDao {
	// select list - all
				public List<StaffVo> selectAllList(SqlSession session) {
					return session.selectList("staffMapper.selectAllList");
				}

				// select one 
				public StaffVo selectOne(SqlSession session, String staffId) {
					return session.selectOne("staffMapper.selectOne", staffId );
				}

				// insert
				public int insert(SqlSession session, StaffVo vo) {
					return session.insert("staffMapper.insert", vo);
				}

				// update
				public int update(SqlSession session, StaffVo vo) {
					return session.update("staffMapper.update", vo);
				}

				// delete
				public int delete(SqlSession session, String staffId) {
					return session.delete("staffMapper.delete", staffId);
				}

			}