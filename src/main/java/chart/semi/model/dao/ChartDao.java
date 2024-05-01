package chart.semi.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.ChartListVo;
import chart.semi.model.vo.ChartReadReqVo;
import chart.semi.model.vo.ChartReadVo;
import chart.semi.model.vo.ChartVo;
import chart.semi.model.vo.PnoteCommentVo;
import chart.semi.model.vo.PnoteReplyWriteVo;
import chart.semi.model.vo.StaffChartListVo;
import chart.semi.model.vo.StaffChartWriteVo;
import chart.semi.model.vo.StaffVo;

public class ChartDao {
	
	// select total Count
	public Integer selectTotalCount(SqlSession session, String patientId) {
		System.out.println("dao selectTotalCount patientId: "+patientId);
		return session.selectOne("chartMapper.selectTotalCount", patientId);
	}

	// select list - page
	public List<ChartListVo> selectPageList(SqlSession session, int start, int end, String patientId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("startRownum", start);
		param.put("endRownum", end);
		param.put("patientId", patientId);
		return session.selectList("chartMapper.selectPageList", param);
	}
	// select list - page
	public List<ChartListVo> selectPageListRowBounds(SqlSession session,int pageSize,  int currentPageNum, String patientId) {
		int offset = (currentPageNum - 1) * pageSize;
		RowBounds rbounds = new RowBounds( offset , pageSize);
		return session.selectList("chartMapper.selectPageListRowBounds", patientId, rbounds);
	}
	// select list - all
	public List<ChartListVo> selectAllList(SqlSession session, String chartId) {
		return session.selectList("chartMapper.selectAllList",chartId);
	}
	// select list - ChartListAll
	public List<StaffChartListVo> selectChartByPatientId(SqlSession session, String patientId) {
		return session.selectList("chartMapper.selectChartByPatientId", patientId);
	}
	// select list - PnoteCommentALL
	public List<PnoteCommentVo> selectAllPnoteLis(SqlSession session, String chartId) {
		return session.selectList("pnoteCommentMapper.selectAllPnoteLis", chartId);
	}
	
	// selectRead
	public ChartReadVo selectRead(SqlSession session, ChartReadReqVo vo) {
		return session.selectOne("chartMapper.selectRead", vo);
	}
	
	// select one 
	public ChartVo selectOne(SqlSession session, String chartId) {
		return session.selectOne("chartMapper.selectOne", chartId );
	}
	
	// insert
	public int insert(SqlSession session, StaffVo vo) {
		return session.insert("chartMapper.insert", vo);
	}
	// insert_ 글등록 
	public int insertStaffWrite(SqlSession session, StaffChartWriteVo vo) {
		return session.insert("chartMapper.insertStaffWrite", vo);
	}
	// insert_댓글 등록(회원)
	public int insertPnoteReply(SqlSession session, PnoteReplyWriteVo vo) {
		return session.insert("pnoteCommentMapper.insertPnoteReply", vo);
	}
	// update
	public int update(SqlSession session, ChartVo vo) {
		return session.update("chartMapper.update", vo);
	}

	// delete
	public int delete(SqlSession session, String ChartId) {
		return session.delete("chartMapper.delete", ChartId);
	}

}
