package chart.semi.model.vo;

import java.sql.Connection;
import java.util.List;

public class ClientVo{
//	"CLIENT_ID"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_PWD"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)
//
	private String clientId;	
	private String clientPwd;
	private String clientEmail;
	private String patientId;
	
	public ClientVo(String clientId, String clientPwd, String clientEmail, String patientId) {
		super();
		this.clientId = clientId;
		this.clientPwd = clientPwd;
		this.clientEmail = clientEmail;
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "ClientVo [clientId=" + clientId + ", clientPwd=" + clientPwd + ", clientEmail=" + clientEmail
				+ ", patientId=" + patientId + "]";
	}
	public String getClientId() {
		return clientId;
	}
	public String getClientPwd() {
		return clientPwd;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public String getPatientId() {
		return patientId;
	}
	

	

}