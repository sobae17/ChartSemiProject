package chart.semi.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.ChartVo;



public class ChartDao {
	
	// select total Count
		public Integer selectTotalCount(SqlSession session) {
			return session.selectOne("chartMapper.selectTotalCount");
		}
	// select list - all
	public List<ChartVo> selectPageList(SqlSession session, int start, int end) {
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("startRownum", start);
		param.put("endRownum", end);
		return session.selectList("chartMapper.selectPageList", param);
	}
	// select list - all
	public List<ChartVo> selectAllList(SqlSession session) {
		return session.selectList("chartMapper.selectAllList");
	}
	public List<ChartVo> selectPageListRowBounds(SqlSession session,int pageSize,  int currentPageNum) {
		int offset = (currentPageNum - 1) * pageSize;
		RowBounds rbounds = new RowBounds( offset , pageSize);
		return session.selectList("chartMapper.selectPageList", null, rbounds);
	}
	
	// select one 
	public ChartVo selectOne(SqlSession session, String chartId) {
		return session.selectOne("chartMapper.selectOne", chartId );
	}

	// insert
	public int insert(SqlSession session, ChartVo vo) {
		return session.insert("chartMapper.insert", vo);
	}

	// update
	public int update(SqlSession session, ChartVo vo) {
		return session.update("chartMapper.update", vo);
	}

	// delete
	public int delete(SqlSession session, String chartId) {
		return session.delete("chartMapper.delete", chartId);
	}

}
