package chart.semi.model.dto;

public class HealthChartDto {

//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"PULSE"	NUMBER		NULL,
//	"WEIGHT"	NUMBER		NULL,
//	"BLOOD_PRESSURE"	NUMBER		NULL,
//	"PEE"	NUMBER		NULL,
//	"COMMENT"	VARCHAR2(4000)		NULL,
//	"STAFF_ID"	VARCHAR2(7)		NOT NULL
//
	private String chartId;
	private String patientId;
	private Integer pulse;
	private Integer weight;
	private Integer bloodPressure;
	private Integer pee;
	private String comment;
	private String staffId;

	@Override
	public String toString() {
		return "HealthChartDto [chartId=" + chartId + ", patientId=" + patientId + ", pulse=" + pulse + ", weight="
				+ weight + ", bloodPressure=" + bloodPressure + ", pee=" + pee + ", comment=" + comment + ", staffId="
				+ staffId + "]";
	}

	public String getChartId() {
		return chartId;
	}

	public void setChartId(String chartId) {
		this.chartId = chartId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

}
