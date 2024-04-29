package chart.semi.model.vo;

public class ChartReadReqVo {
//	CHART_ID   NOT NULL VARCHAR2(10)   
//	PATIENT_ID NOT NULL VARCHAR2(10)   
//	PTITLE     NOT NULL VARCHAR2(120)  
//	PNOTE      NOT NULL VARCHAR2(4000) 
//	STAFF_ID   NOT NULL VARCHAR2(7)
	private String chartId;
	private String patientId;
	@Override
	public String toString() {
		return "ChartReadReqVo [chartId=" + chartId + ", patientId=" + patientId + "]";
	}
	public ChartReadReqVo(String chartId, String patientId) {
		super();
		this.patientId = patientId;
		this.chartId = chartId;
	}
	public String getChartId() {
		return chartId;
	}
	public String getPatientId() {
		return patientId;
	}
	

}