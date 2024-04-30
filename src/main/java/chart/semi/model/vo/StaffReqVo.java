package chart.semi.model.vo;

public class StaffReqVo {
//	
//	"STAFF_ID"	VARCHAR2(7)		NOT NULL,
//	"STAFF_NAME"	VARCHAR2(10)		NOT NULL,
//	"STAFF_PWD"	VARCHAR2(6)		NOT NULL,
//	"STAFF_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"STAFF_TYPE"	CHAR(2)	DEFAULT 2	NOT NULL
	private String staffId;
	private String staffPwd;
	public StaffReqVo(String staffId, String staffPwd) {
		super();
		this.staffId = staffId;
		this.staffPwd = staffPwd;
	}
	@Override
	public String toString() {
		return "StaffReqVo [staffId=" + staffId + ", staffPwd=" + staffPwd + "]";
	}
	public String getStaffId() {
		return staffId;
	}
	public String getStaffPwd() {
		return staffPwd;
	}

	
}
