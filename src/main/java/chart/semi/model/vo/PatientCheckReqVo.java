package chart.semi.model.vo;

public class PatientCheckReqVo {
//	PATIENT_ID      NOT NULL VARCHAR2(10)  
//	PATIENT_NAME    NOT NULL VARCHAR2(50)  
//	PATIENT_AGE     NOT NULL NUMBER        
//	PATIENT_GENDER  NOT NULL CHAR(1)       
//	PATIENT_DISEASE          VARCHAR2(20)  
//	PATIENT_ADDRESS          VARCHAR2(100) 
//	PATIENT_NO      NOT NULL VARCHAR2(13)
	private String patientName;
	private String patientNo;
	@Override
	public String toString() {
		return "PatientCheckReqVo [patientName=" + patientName + ", patientNo=" + patientNo + "]";
	}
	public PatientCheckReqVo(String patientName, String patientNo) {
		super();
		this.patientName = patientName;
		this.patientNo = patientNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public String getPatientNo() {
		return patientNo;
	}


}
