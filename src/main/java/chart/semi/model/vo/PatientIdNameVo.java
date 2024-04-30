package chart.semi.model.vo;

public class PatientIdNameVo {
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
	public PatientIdNameVo(String patientId, String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
	}
	@Override
	public String toString() {
		return "PatientIdNameVo [patientId=" + patientId + ", patientName=" + patientName + "]";
	}
	public String getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}


}
