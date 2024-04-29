package chart.semi.model.vo;

public class HealthChartReadVo {

//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"PULSE"	NUMBER		NULL,
//	"WEIGHT"	NUMBER		NULL,
//	"BLOOD_PRESSURE"	NUMBER		NULL,
//	"PEE"	NUMBER		NULL,
//	"COMMENT"	VARCHAR2(4000)		NULL,
//	"STAFF_ID"	VARCHAR2(7)		NOT NULL
//
	private String chartdate;
	private String patientName;
	private Integer pulse;
	private Integer weight;
	private Integer bloodPressure;
	private Integer pee;
	private String memo;
	private String staffName;
	
	@Override
	public String toString() {
		return "HealthChartReadVo [chartdate=" + chartdate + ", patientName=" + patientName + ", pulse=" + pulse
				+ ", weight=" + weight + ", bloodPressure=" + bloodPressure + ", pee=" + pee + ", memo=" + memo
				+ ", staffName=" + staffName + "]";
	}
	
	public String getChartdate() {
		return chartdate;
	}

	public void setChartdate(String chartdate) {
		this.chartdate = chartdate;
	}

	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Integer getPulse() {
		return pulse;
	}
	public void setPulse(Integer pulse) {
		this.pulse = pulse;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public Integer getPee() {
		return pee;
	}
	public void setPee(Integer pee) {
		this.pee = pee;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
}
