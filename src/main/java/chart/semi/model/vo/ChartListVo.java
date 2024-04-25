package chart.semi.model.vo;

public class ChartListVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	P_TITLE    NOT NULL VARCHAR2(120)  
//	P_NOTE     NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7) 
	
	private String chartId;
	private String patientId;
	private String pTitle;
	private String pNote;
	private String staffId;
	public ChartListVo(String chartId, String patientId, String pTitle, String pNote, String staffId) {
		super();
		this.chartId = chartId;
		this.patientId = patientId;
		this.pTitle = pTitle;
		this.pNote = pNote;
		this.staffId = staffId;
	}
	@Override
	public String toString() {
		return "ChartListVo [chartId=" + chartId + ", patientId=" + patientId + ", pTitle=" + pTitle + ", pNote="
				+ pNote + ", staffId=" + staffId + "]";
	}
	public String getChartId() {
		return chartId;
	}
	public String getPatientId() {
		return patientId;
	}
	public String getpTitle() {
		return pTitle;
	}
	public String getpNote() {
		return pNote;
	}
	public String getStaffId() {
		return staffId;
	}
	
	
}
