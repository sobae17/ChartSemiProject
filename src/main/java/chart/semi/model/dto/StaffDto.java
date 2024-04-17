package chart.semi.model.dto;

public class StaffDto {
//	
//	"STAFF_ID"	VARCHAR2(7)		NOT NULL,
//	"STAFF_NAME"	VARCHAR2(10)		NOT NULL,
//	"STAFF_PWD"	VARCHAR2(6)		NOT NULL,
//	"STAFF_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"STAFF_TYPE"	CHAR(2)	DEFAULT 2	NOT NULL
	private String staffId;
	private String staffPwd;
	private String staffEmail;
	private Integer staffType;
	@Override
	public String toString() {
		return "StaffDto [staffId=" + staffId + ", staffPwd=" + staffPwd + ", staffEmail=" + staffEmail + ", staffType="
				+ staffType + "]";
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffPwd() {
		return staffPwd;
	}
	public void setStaffPwd(String staffPwd) {
		this.staffPwd = staffPwd;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public Integer getStaffType() {
		return staffType;
	}
	public void setStaffType(Integer staffType) {
		this.staffType = staffType;
	}



}
