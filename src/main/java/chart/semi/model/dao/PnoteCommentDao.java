package chart.semi.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.PnoteCommentVo;
import chart.semi.model.vo.PnoteReplyWriteVo;




public class PnoteCommentDao {
	// select list - all
			public List<PnoteCommentVo> selectAllList(SqlSession session) {
				return session.selectList("pnoteCommentMapper.selectAllList");
			}
			// select list - PnoteCommentALL
			public List<PnoteCommentVo> selectAllPnoteList(SqlSession session, String chartId) {
				return session.selectList("pnoteCommentMapper.selectAllPnoteList", chartId);
			}
			// select one 
			public PnoteCommentVo selectOne(SqlSession session, String patientId) {
				return session.selectOne("pnoteCommentMapper.selectOne", patientId );
			}

			// insert 댓글
			public int insertPnoteReply(SqlSession session, PnoteReplyWriteVo vo) {
				return session.insert("pnoteCommentMapper.insertPnoteReply", vo);
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