package chart.semi.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import chart.semi.model.vo.ChartVo;

import static chart.semi.common.JdbcTemplate.close;

public class ChartDao {
	// select list - all
	public List<ChartVo> selectAllList(Connection conn) {
		List<ChartVo> result = null;
		String sql = "select * from chart";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			rs = pstmt.executeQuery();
			// ResetSet처리
			if (rs.next()) {
				result = new ArrayList<ChartVo>();
				do {
					ChartVo vo = null;// new ChartDto(
										// rs.getString("chartId"),rs.getString("pationId"),rs.getString("writer"),rs.getString("pnote"));
					result.add(vo);
				} while (rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(rs);
		close(pstmt);
		return result;
	}

	// select one
	public ChartVo selectOne(Connection conn, String chartId) {
		ChartVo result = null;
		String sql = "SELECT MEM_ID,MEM_PWD,MEM_EMAIL  FROM MEMBER WHERE MEM_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, chartId);
			rs = pstmt.executeQuery();
			// ResetSet처리
			if (rs.next()) {
				result = null;// new ChartDto(
								// rs.getString("chartId"),rs.getString("pationId"),rs.getString("writer"),rs.getString("pnote"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(rs);
		close(pstmt);
		return result;
	}

	// insert
	public int insert(Connection conn, ChartVo vo) {
		int result = 0;
//			INSERT INTO MEMBER VALUES ('kh1', 'pwd1', 'kh1@a.com');
		String sql = "INSERT INTO MEMBER (MEM_ID,MEM_PWD,MEM_EMAIL) VALUES (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, vo.getChartId());
			pstmt.setString(2, vo.getPationId());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getpNote());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	}

	// update
	public int update(Connection conn, ChartVo vo) {
		int result = 0;
		String sql = ""; // TODO
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	}

	// delete
	public int delete(Connection conn, String chartId) {
		int result = 0;
		String sql = "DELETE FROM  WHERE MEM_ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, chartId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	}

}
