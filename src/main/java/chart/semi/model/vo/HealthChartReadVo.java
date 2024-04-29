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
	private String chartId;
	private String patientId;
	private Integer pulse;
	private Integer weight;
	private Integer bloodPressure;
	private Integer pee;
	private String memo;
	private String staffId;
	
	@Override
	public String toString() {
		return "HealthChartReadVo [chartId=" + chartId + ", patientId=" + patientId + ", pulse=" + pulse + ", weight="
				+ weight + ", bloodPressure=" + bloodPressure + ", pee=" + pee + ", memo=" + memo + ", staffId="
				+ staffId + "]";
	}
	public HealthChartReadVo(String chartId, String patientId, Integer pulse, Integer weight, Integer bloodPressure,
			Integer pee, String memo, String staffId) {
		super();
		this.chartId = chartId;
		this.patientId = patientId;
		this.pulse = pulse;
		this.weight = weight;
		this.bloodPressure = bloodPressure;
		this.pee = pee;
		this.memo = memo;
		this.staffId = staffId;
	}
	public String getChartId() {
		return chartId;
	}
	public String getPatientId() {
		return patientId;
	}
	public Integer getPulse() {
		return pulse;
	}
	public Integer getWeight() {
		return weight;
	}
	public Integer getBloodPressure() {
		return bloodPressure;
	}
	public Integer getPee() {
		return pee;
	}
	public String getMemo() {
		return memo;
	}
	public String getStaffId() {
		return staffId;
	}

}
