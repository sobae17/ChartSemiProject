package chart.semi.model.vo;


public class ClientLoginReqVo{
//	"CLIENT_ID"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_PWD"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)
//
	private String clientId;	
	private String clientPwd;
	@Override
	public String toString() {
		return "ClientLoginVo [clientId=" + clientId + ", clientPwd=" + clientPwd + "]";
	}
	public ClientLoginReqVo(String clientId, String clientPwd) {
		super();
		this.clientId = clientId;
		this.clientPwd = clientPwd;
	}
	public String getClientId() {
		return clientId;
	}
	public String getClientPwd() {
		return clientPwd;
	}
	
}