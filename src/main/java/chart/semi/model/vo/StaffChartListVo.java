package chart.semi.model.vo;

public class StaffChartListVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE    NOT NULL VARCHAR2(120)  
//	PNOTE     NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7) 

	private String chartdate;
	private String ptitle;
	private String staffName;
	private String chartId;
	private String patientName;
	@Override
	public String toString() {
		return "StaffChartListVo [chartdate=" + chartdate + ", ptitle=" + ptitle + ", staffName=" + staffName
				+ ", chartId=" + chartId + ", patientName=" + patientName + "]";
	}
	public String getChartdate() {
		return chartdate;
	}
	public void setChartdate(String chartdate) {
		this.chartdate = chartdate;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getChartId() {
		return chartId;
	}
	public void setChartId(String chartId) {
		this.chartId = chartId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
}