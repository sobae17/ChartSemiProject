package chart.semi.model.vo;

public class StaffChartWriteVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE     NOT NULL VARCHAR2(120)  
//	PNOTE      NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7)    
 private String chartId;
 private String patientId;
 private String ptitle;
 private String pnote;
 private String staffId;
@Override
public String toString() {
	return "StaffChartWriteVo [chartId=" + chartId + ", patientId=" + patientId + ", ptitle=" + ptitle + ", pnote="
			+ pnote + ", staffId=" + staffId + "]";
}

public StaffChartWriteVo(String chartId, String patientId, String ptitle, String pnote, String staffId) {
	super();
	this.chartId = chartId;
	this.patientId = patientId;
	this.ptitle = ptitle;
	this.pnote = pnote;
	this.staffId = staffId;
}

public String getChartId() {
	return chartId;
}
public void setChartId(String chartId) {
	this.chartId = chartId;
}
public String getpatientId() {
	return patientId;
}
public void setpatientId(String patientId) {
	this.patientId = patientId;
}
public String getPtitle() {
	return ptitle;
}
public void setPtitle(String ptitle) {
	this.ptitle = ptitle;
}
public String getPnote() {
	return pnote;
}
public void setPnote(String pnote) {
	this.pnote = pnote;
}
public String getStaffId() {
	return staffId;
}
public void setStaffId(String staffId) {
	this.staffId = staffId;
}

 

}

	