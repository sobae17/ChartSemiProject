package chart.semi.model.vo;

public class PnoteReplyWriteVo {
//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"PNOTE_REPLAY"	VARCHAR2(4000)		NOT NULL,
//	"PNOTE_REP"	VARCHAR2(4000)		NULL
	
	private String chartId;
	private String patientId;
	private String clientId;
	private String pnoteReplay;
	@Override
	public String toString() {
		return "PnoteReplyWriteVo [chartId=" + chartId + ", patientId=" + patientId + ", clientId=" + clientId
				+ ", pnoteReplay=" + pnoteReplay + "]";
	}
	public PnoteReplyWriteVo(String chartId, String patientId, String clientId, String pnoteReplay) {
		super();
		this.chartId = chartId;
		this.patientId = patientId;
		this.clientId = clientId;
		this.pnoteReplay = pnoteReplay;
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
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPnoteReplay() {
		return pnoteReplay;
	}
	public void setPnoteReplay(String pnoteReplay) {
		this.pnoteReplay = pnoteReplay;
	}

}