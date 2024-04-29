package chart.semi.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import chart.semi.model.vo.HealthChartReadReqVo;
import chart.semi.model.vo.HealthChartReadVo;
import chart.semi.model.vo.HealthChartVo;



public class HealthChartDao {
	// select list - all
		public List<HealthChartVo> selectAllList(SqlSession session) {
			return session.selectList("healthChartMapper.selectAllList");
		}
		public HealthChartReadVo selectOneLast(SqlSession session, String patientId ) {
			return session.selectOne("healthChartMapper.selectOneLast", patientId );
		}
		public HealthChartReadVo selectOneDate(SqlSession session, HealthChartReadReqVo vo ) {
			return session.selectOne("healthChartMapper.selectOneDate", vo );
		}

		// select one 
		public HealthChartVo selectOne(SqlSession session, String chartId) {
			return session.selectOne("healthChartMapper.selectOne", chartId );
		}

		// insert
		public int insert(SqlSession session, HealthChartVo vo) {
			return session.insert("healthChartMapper.insert", vo);
		}

		// update
		public int update(SqlSession session, HealthChartVo vo) {
			return session.update("healthChartMapper.update", vo);
		}

		// delete
		public int delete(SqlSession session, String chartId) {
			return session.delete("healthChartMapper.delete", chartId);
		}


	}

