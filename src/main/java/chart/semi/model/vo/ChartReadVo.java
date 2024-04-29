package chart.semi.model.vo;

public class ChartReadVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE     NOT NULL VARCHAR2(120)  
//	PNOTE      NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7)
	private String chartdate;
	private String ptitle;
	private String pnote;
	private String staffName;
	private String chartId;
	private String patientName;
	@Override
	public String toString() {
		return "ChartReadVo [chartdate=" + chartdate + ", ptitle=" + ptitle + ", pnote=" + pnote + ", staffName="
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