package chart.semi.model.vo;

import java.sql.Connection;
import java.util.List;

public class ClientJoinVo{
//	"CLIENT_ID"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_PWD"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)
//
	private String clientId;	
	private String clientPwd;
	private String clientEmail;
	private String patientId;
	private String patientName;
	private String patientNo;
	
	
	public ClientJoinVo(String clientId, String clientPwd, String clientEmail, String patientId, String patientName,
			String patientNo) {
		super();
		this.clientId = clientId;
		this.clientPwd = clientPwd;
		this.clientEmail = clientEmail;
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientNo = patientNo;
	}
	@Override
	public String toString() {
		return "ClientJoinVo [clientId=" + clientId + ", clientPwd=" + clientPwd + ", clientEmail=" + clientEmail
				+ ", patientId=" + patientId + ", patientName=" + patientName + ", patientNo=" + patientNo + "]";
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
	public String getPatientName() {
		return patientName;
	}
	public String getPatientNo() {
		return patientNo;
	}

}