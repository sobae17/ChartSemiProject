package chart.semi.model.vo;

public class ClientInfoVo {
//	"CLIENT_NUM"	NUMBER(2)	DEFAULT 1	NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"CLIENT_NAME"	VARCHAR2(20)		NOT NULL,
//	"CLIENT_PHONE"	NUMBER		NOT NULL,
//	"FAMILY"	VARCHAR2(10)		NOT NULL,
//	"CLIENT_ADDRESS"	VARCHAR2(100)		NULL,
//	"CLIENT_NO"	VARCHAR2(13)		NOT NULL

	private Integer clientNum;
	private String patientId;
	private String clientName;
	private Integer phone;
	private String family;
	private String clientAddess;
	private String clientNo;
	@Override
	public String toString() {
		return "ClientInfoDto [clientNum=" + clientNum + ", patientId=" + patientId + ", clientName=" + clientName
				+ ", phone=" + phone + ", family=" + family + ", clientAddess=" + clientAddess + ", clientNo="
				+ clientNo + "]";
	}
	public Integer getClientNum() {
		return clientNum;
	}
	public void setClientNum(Integer clientNum) {
		this.clientNum = clientNum;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getClientAddess() {
		return clientAddess;
	}
	public void setClientAddess(String clientAddess) {
		this.clientAddess = clientAddess;
	}
	public String getClientNo() {
		return clientNo;
	}
	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}
	
	

}
