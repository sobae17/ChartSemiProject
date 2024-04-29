package chart.semi.model.vo;

public class ChartReadVo {
	private String rn;
	private String chartdate;
	private String ptitle;
	private String pnote;
	private String staffName;
	private String chartId;
	private String patientName;
	public ChartReadVo(String rn, String chartdate, String ptitle, String pnote, String staffName, String chartId,
			String patientName) {
		super();
		this.rn = rn;
		this.chartdate = chartdate;
		this.ptitle = ptitle;
		this.pnote = pnote;
		this.staffName = staffName;
		this.chartId = chartId;
		this.patientName = patientName;
	}
	@Override
	public String toString() {
		return "ChartReadVo [rn=" + rn + ", chartdate=" + chartdate + ", ptitle=" + ptitle + ", pnote=" + pnote
				+ ", staffName=" + staffName + ", chartId=" + chartId + ", patientName=" + patientName + "]";
	}
	public String getRn() {
		return rn;
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