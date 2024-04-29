package chart.semi.model.vo;

public class ChartListVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE    NOT NULL VARCHAR2(120)  
//	PNOTE     NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7) 
	
	private String rn;
	private String chartdate;
	private String ptitle;
	private String staffName;
	private String chartId;
	private String patientName;
	@Override
	public String toString() {
		return "ChartListVo [rn=" + rn + ", chartdate=" + chartdate + ", ptitle=" + ptitle + ", staffName=" + staffName
				+ ", chartId=" + chartId + ", patientName=" + patientName + "]";
	}
	public ChartListVo(String rn, String chartdate, String ptitle, String staffName, String chartId,
			String patientName) {
		super();
		this.rn = rn;
		this.chartdate = chartdate;
		this.ptitle = ptitle;
		this.staffName = staffName;
		this.chartId = chartId;
		this.patientName = patientName;
	}
	public String getRn() {
		return rn;
	}
	public String getChartdate() {
		return chartdate;
	}
	public String getPtitle() {
		return ptitle;
	}
	public String getStaffName() {
		return staffName;
	}
	public String getChartId() {
		return chartId;
	}
	public String getPatientName() {
		return patientName;
	}

	


}