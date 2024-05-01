package chart.semi.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static chart.semi.common.MybatisTemplate.*;

import chart.semi.model.dao.ChartDao;
import chart.semi.model.dao.PnoteCommentDao;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.ClientVo;
import chart.semi.model.vo.PnoteCommentVo;
import chart.semi.model.vo.PnoteReplyWriteVo;

public class PnoteCommentService {
	private PnoteCommentDao dao = new PnoteCommentDao(); 
	
	// select list - all
	public List<PnoteCommentVo> selectAllList(String chartId, String patientId, String pnoteReplay, String pnoteRep) {
		List<PnoteCommentVo> result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectAllList(session); 
		session.close();
		return result;
	}

	// select one
	public PnoteCommentVo selectOne(String patientId) {
		PnoteCommentVo result = null;
		SqlSession session = getSqlSession(true);
		result = dao.selectOne(session, patientId);
		session.close();
		return result;
	}
	// insert
	public int insert(PnoteCommentVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insert(session, vo);
		session.close();
		return result;
	}
	// insert 댓글 등록
	public int insertPnoteReply(PnoteReplyWriteVo vo) {
		int result = 0;
		SqlSession session = getSqlSession(true);
		result = dao.insertPnoteReply(session, vo);
		session.close();
		return result;
	}
	// update
	public int update(PnoteCommentVo vo) {
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