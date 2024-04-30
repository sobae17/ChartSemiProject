package chart.semi.model.vo;

public class StaffChartListVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE    NOT NULL VARCHAR2(120)  
//	PNOTE     NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7) 

	private String chartdate;
	private String ptitle;
	private String pnote;	
	private String staffName;
	private String chartId;
	private String patientName;
	public StaffChartListVo(String chartdate, String ptitle, String pnote, String staffName, String chartId,
			String patientName) {
		super();
		this.chartdate = chartdate;
		this.ptitle = ptitle;
		this.pnote = pnote;
		this.staffName = staffName;
		this.chartId = chartId;
		this.patientName = patientName;
	}
	
	public void setChartdate(String chartdate) {
		this.chartdate = chartdate;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public void setPnote(String pnote) {
		this.pnote = pnote;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public void setChartId(String chartId) {
		this.chartId = chartId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public StaffChartListVo() {
		super();
	}

	@Override
	public String toString() {
		return "StaffChartListVo [chartdate=" + chartdate + ", ptitle=" + ptitle + ", pnote=" + pnote + ", staffName="
				+ staffName + ", chartId=" + chartId + ", patientName=" + patientName + "]";
	}
	public String getChartdate() {
		return chartdate;
	}
	public String getPtitle() {
		return ptitle;
	}
	public String getPnote() {
		return pnote;
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