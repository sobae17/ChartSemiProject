package chart.semi.model.vo;

public class StaffVo {
//	
//	"STAFF_ID"	VARCHAR2(7)		NOT NULL,
//	"STAFF_NAME"	VARCHAR2(10)		NOT NULL,
//	"STAFF_PWD"	VARCHAR2(6)		NOT NULL,
//	"STAFF_EMAIL"	VARCHAR2(100)		NOT NULL,
//	"STAFF_TYPE"	CHAR(2)	DEFAULT 2	NOT NULL
	private String staffId;
	private String staffName;
	private String staffEmail;
	private Integer staffType;
	
	public StaffVo(String staffId, String staffName, String staffEmail, Integer staffType) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.staffType = staffType;
	}
	@Override
	public String toString() {
		return "StaffVo [staffId=" + staffId + ", staffName=" + staffName + ", staffEmail="
				+ staffEmail + ", staffType=" + staffType + "]";
	}
	public String getStaffId() {
		return staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public Integer getStaffType() {
		return staffType;
	}

}
