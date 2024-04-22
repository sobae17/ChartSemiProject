package chart.semi.model.vo;


public class ClientLoginResVo{
//	"CLIENT_ID"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_PWD"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)
//
	private String clientId;	
	private String clientEmail;
	private String patientId;
	@Override
	public String toString() {
		return "ClientLoginResVo [clientId=" + clientId + ", clientEmail=" + clientEmail + ", patientId=" + patientId
				+ "]";
	}
	public ClientLoginResVo(String clientId, String clientEmail, String patientId) {
		super();
		this.clientId = clientId;
		this.clientEmail = clientEmail;
		this.patientId = patientId;
	}
	public String getClientId() {
		return clientId;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public String getPatientId() {
		return patientId;
	}
	
}