package chart.semi.service;

import java.sql.Connection;
import java.util.List;

import chart.semi.model.dto.ClientDto;

public class ChartService {
private ClientDto dao = new ClientDto(); 
	
	// select list - all
	public List<ClientDto> selectAllList() {
		List<ClientDto> result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectAllList(conn);
		close(conn);
		return result;
	}
	private void close(Connection conn) {
		// TODO Auto-generated method stub
		
	}
	private Connection getSemiConnection(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	// select one
	public ClientDto selectOne(String memId) {
		ClientDto result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectOne(conn, memId);
		close(conn);
		return result;
	}
	// insert
	public int insert(ClientDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);
		result = dao.insert(conn, dto);
		close(conn);
		return result;
	}
	// update
	public int update(ClientDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);
		result = dao.update(conn, dto);
		close(conn);
		return result;
	}
	// delete
	public int delete(String memId) {
		int result = 0;
		Connection conn = null;
		result = dao.delete(conn, memId);
		close(conn);
		return result;
}
}