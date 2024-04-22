package chart.semi.model.vo;

public class ChartVo {
//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"WRITER"	VARCHAR2(10)		NOT NULL,
//	"P_NOTE"	VARCHAR2(4000)		NOT NULL

	private String chartId;
	private String patientId;
	private String writer;
	private String pnote;
	@Override
	public String toString() {
		return "ChartVo [chartId=" + chartId + ", patientId=" + patientId + ", writer=" + writer + ", pnote=" + pnote
				+ "]";
	}
	public ChartVo(String chartId, String patientId, String writer, String pnote) {
		super();
		this.chartId = chartId;
		this.patientId = patientId;
		this.writer = writer;
		this.pnote = pnote;
	}
	public String getChartId() {
		return chartId;
	}
	public String getPatientId() {
		return patientId;
	}
	public String getWriter() {
		return writer;
	}
	public String getPnote() {
		return pnote;
	}
	
	
	
}
