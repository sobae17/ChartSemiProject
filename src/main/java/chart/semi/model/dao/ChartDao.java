package chart.semi.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.ChartVo;

public class ChartDao {
	// select list - all
	public List<ChartVo> selectAllList(SqlSession session) {
		return session.selectList("chartMapper.selectAllList");
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
