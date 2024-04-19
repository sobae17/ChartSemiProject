package chart.semi.model.dto;

import java.sql.Connection;
import java.util.List;

public class ClientDto {
//	"CLIENT_ID"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_PWD"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)
//
	private String clientId;	
	private String clientPwd;
	private String clientEmail;
	private String patientId;
	@Override
	public String toString() {
		return "ClientDto [clientId=" + clientId + ", clientPwd=" + clientPwd + ", clientEmail=" + clientEmail
				+ ", patientId=" + patientId + "]";
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientPwd() {
		return clientPwd;
	}
	public void setClientPwd(String clientPwd) {
		this.clientPwd = clientPwd;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public List<ClientDto> selectAllList(Connection conn) {
		// TODO Auto-generated method stub
		return null;
	}
	public ClientDto selectOne1(Connection conn, String memId) {
		// TODO Auto-generated method stub
		return null;
	}
	public ClientDto selectOne(Connection conn, String memId) {
		// TODO Auto-generated method stub
		return null;
	}
	public int insert(Connection conn, ClientDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int update(Connection conn, ClientDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int delete(Connection conn, String memId) {
		// TODO Auto-generated method stub
		return 0;
	}


}
