package chart.semi.model.vo;

public class HealthChartReadReqVo {

//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"PULSE"	NUMBER		NULL,
//	"WEIGHT"	NUMBER		NULL,
//	"BLOOD_PRESSURE"	NUMBER		NULL,
//	"PEE"	NUMBER		NULL,
//	"COMMENT"	VARCHAR2(4000)		NULL,
//	"STAFF_ID"	VARCHAR2(7)		NOT NULL
//
	private String healthDate;
	private String patientId;
	@Override
	public String toString() {
		return "HealthChartReadReqVo [healthDate=" + healthDate + ", patientId=" + patientId + "]";
	}
	public String getHealthDate() {
		return healthDate;
	}
	public void setHealthDate(String healthDate) {
		this.healthDate = healthDate;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public HealthChartReadReqVo(String healthDate, String patientId) {
		super();
		this.healthDate = healthDate;
		this.patientId = patientId;
	}
	
}
