package chart.semi.model.dto;

public class ChartDto {
//	"CHART_ID"	VARCHAR2(10)		NOT NULL,
//	"PATIENT_ID"	VARCHAR2(10)		NOT NULL,
//	"WRITER"	VARCHAR2(10)		NOT NULL,
//	"P_NOTE"	VARCHAR2(4000)		NOT NULL

	private String chartId;
	private String pationId;
	private String writer;
	private String pnote;
	@Override
	public String toString() {
		return "ChartDto [chartId=" + chartId + ", pationId=" + pationId + ", writer=" + writer + ", pNote=" + pnote
				+ "]";
	}
	public String getChartId() {
		return chartId;
	}
	public void setChartId(String chartId) {
		this.chartId = chartId;
	}
	public String getPationId() {
		return pationId;
	}
	public void setPationId(String pationId) {
		this.pationId = pationId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getpNote() {
		return pnote;
	}
	public void setpNote(String pNote) {
		this.pnote = pNote;
	}
	
	
	
}
