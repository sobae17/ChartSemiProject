package chart.semi.model.dao;

import static chart.semi.common.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chart.semi.model.dto.ChartDto;
import chart.semi.model.dto.ClientDto;

public class ClientDao {
	// select list - all
	public List<ClientDao> selectAllList(Connection conn) {
		List<ClientDao> result = null;
		String sql = "select * from chlient";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			rs = pstmt.executeQuery();
			// ResetSet처리
			if (rs.next()) {
				result = new ArrayList<ClientDao>();
				do {
					ClientDao dto = null;// new ChartDto(
										// rs.getString("chartId"),rs.getString("pationId"),rs.getString("writer"),rs.getString("pnote"));
					result.add(dto);
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
	public ClientDao selectOne(Connection conn, String clientId) {
		ClientDao result = null;
		String sql = "SELECT MEM_ID,MEM_PWD,MEM_EMAIL  FROM MEMBER WHERE MEM_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, clientId);
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
	public int insert(Connection conn, ChartDto dto) {
		int result = 0;
//			INSERT INTO MEMBER VALUES ('kh1', 'pwd1', 'kh1@a.com');
		String sql = "INSERT INTO MEMBER (MEM_ID,MEM_PWD,MEM_EMAIL) VALUES (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, dto.getChartId());
			pstmt.setString(2, dto.getPationId());
			pstmt.setString(3, dto.getWriter());
			pstmt.setString(4, dto.getpNote());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	}

	// update
	public int update(Connection conn, ClientDto dto) {
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
	public int delete(Connection conn, String clientId) {
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE MEM_ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, clientId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(pstmt);
		return result;
	}

}
