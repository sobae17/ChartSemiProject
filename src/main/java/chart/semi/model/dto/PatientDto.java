package chart.semi.model.dto;

public class PatientDto {
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_NAME"	VARCHAR2(50)		NOT NULL,
//	"PATIENT_AGE"	NUMBER		NOT NULL,
//	"PATIENT_GENDER"	CHAR(1)		NOT NULL,
//	"PATIENT_DISEASE"	VARCHAR2(20)		NULL,
//	"PATIENT_ADDRESS"	VARCHAR2(100)		NULL,
//	"PATIENT_NO"	VARCHAR2(13)		NOT NULL
//	
	
	private String patientId;
	private String patientName;
	private Integer patientAge;
	private Integer patientGender;
	private String patientDisease;
	private String patientAddress;
	private String patientNo;
	@Override
	public String toString() {
		return "PatientDto [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientGender=" + patientGender + ", patientDisease=" + patientDisease + ", patientAddress="
				+ patientAddress + ", patientNo=" + patientNo + "]";
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Integer getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}
	public Integer getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(Integer patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}
	
	
}
