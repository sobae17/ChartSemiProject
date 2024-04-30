package chart.semi.model.vo;

public class StaffChartWriteVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE     NOT NULL VARCHAR2(120)  
//	PNOTE      NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7)    
 private String chartId;
 private String patuentId;
 private String ptitle;
 private String pnote;
 private String staffId;
@Override
public String toString() {
	return "StaffChartWriteVo [chartId=" + chartId + ", patuentId=" + patuentId + ", ptitle=" + ptitle + ", pnote="
			+ pnote + ", staffId=" + staffId + "]";
}
public String getChartId() {
	return chartId;
}
public void setChartId(String chartId) {
	this.chartId = chartId;
}
public String getPatuentId() {
	return patuentId;
}
public void setPatuentId(String patuentId) {
	this.patuentId = patuentId;
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

	