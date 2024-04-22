package chart.semi.service;

import java.sql.Connection;
import java.util.List;

import chart.semi.model.vo.ClientVo;



public class ChartService {
private ClientVo vo = new ClientVo(); 
	
	// select list - all
	public List<ClientVo> selectAllList() {
		List<ClientVo> result = null;
		Connection conn = getSemiConnection(true);
//		result = vo.selectAllList(conn);
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
	public ClientVo selectOne(String clientId) {
		ClientVo result = null;
		Connection conn = getSemiConnection(true);
//		result = vo.selectOne(conn, clientId);
		close(conn);
		return result;
	}
	// insert
	public int insert(ClientVo vo) {
		int result = 0;
		Connection conn = getSemiConnection(true);
//		result = vo.insert(conn, vo);
		close(conn);
		return result;
	}
	// update
	public int update(ClientVo vo) {
		int result = 0;
		Connection conn = getSemiConnection(true);
//		result = vo.update(conn, vo);
		close(conn);
		return result;
	}
	// delete
	public int delete(String clientId) {
		int result = 0;
		Connection conn = null;
//		result = vo.delete(conn, clientId);
		close(conn);
		return result;
}
}