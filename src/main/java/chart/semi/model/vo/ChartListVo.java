package chart.semi.model.vo;

public class ChartListVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE    NOT NULL VARCHAR2(120)  
//	PNOTE     NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7) 
	
	private String chartId;
	private String patientId;
	private String ptitle;
	private String pnote;
	private String staffId;
	public ChartListVo(String chartId, String patientId, String ptitle, String pnote, String staffId) {
		super();
		this.chartId = chartId;
		this.patientId = patientId;
		this.ptitle = ptitle;
		this.pnote = pnote;
		this.staffId = staffId;
	}
	@Override
	public String toString() {
		return "ChartListVo [chartId=" + chartId + ", patientId=" + patientId + ", ptitle=" + ptitle + ", pnote="
				+ pnote + ", staffId=" + staffId + "]";
	}
	public String getChartId() {
		return chartId;
	}
	public String getPatientId() {
		return patientId;
	}
	public String getPtitle() {
		return ptitle;
	}
	public String getPnote() {
		return pnote;
	}
	public String getStaffId() {
		return staffId;
	}


}