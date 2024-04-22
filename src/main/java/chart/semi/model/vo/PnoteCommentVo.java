package chart.semi.model.vo;

public class PnoteCommentVo {
//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"PNOTE_REPLAY"	VARCHAR2(4000)		NOT NULL,
//	"PNOTE_REP"	VARCHAR2(4000)		NULL
	
	private String chartId;
	private String patientId;
	private String pnoteReplay;
	private String pnoteRep;
	@Override
	public String toString() {
		return "PnoteCommentDto [chartId=" + chartId + ", patientId=" + patientId + ", pnoteReplay=" + pnoteReplay
				+ ", pnoteRep=" + pnoteRep + "]";
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
	public String getPnoteReplay() {
		return pnoteReplay;
	}
	public void setPnoteReplay(String pnoteReplay) {
		this.pnoteReplay = pnoteReplay;
	}
	public String getPnoteRep() {
		return pnoteRep;
	}
	public void setPnoteRep(String pnoteRep) {
		this.pnoteRep = pnoteRep;
	}
	
	
	
	
	
}
