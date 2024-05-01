package chart.semi.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.PnoteCommentVo;




public class PnoteCommentDao {
	// select list - all
			public List<PnoteCommentVo> selectAllList(SqlSession session) {
				return session.selectList("pnoteCommentMapper.selectAllList");
			}

			// select one 
			public PnoteCommentVo selectOne(SqlSession session, String patientId) {
				return session.selectOne("pnoteCommentMapper.selectOne", patientId );
			}

			// insert
			public int insert(SqlSession session, PnoteCommentVo vo) {
				return session.insert("pnoteCommentMapper.insert", vo);
			}

			// update
			public int update(SqlSession session, PnoteCommentVo vo) {
				return session.update("pnoteCommentMapper.update", vo);
			}

			// delete
			public int delete(SqlSession session, String patientId) {
				return session.delete("pnoteCommentMapper.delete", patientId);
			}

		}