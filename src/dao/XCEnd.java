package dao;
//网元内交叉连接一端
public class XCEnd {
	private String meId;
	private String ptp;
	private String ctp;
	
	public XCEnd() {
		
	}
	
	public XCEnd(String meId, String ptp, String ctp) {
		this.meId = meId;
		this.ptp = ptp;
		this.ctp = ctp;
	}
	public String getMeId() {
		return this.meId;
	}
	public void setMeId(String meId) {
		this.meId = meId;
	}
	public String getPtp() {
		return this.ptp;
	}
	public void setPtp(String ptp) {
		this.ptp = ptp;
	}
	public String getCtp() {
		return this.ctp;
	}
	public void setCtp(String ctp) {
		this.ctp = ctp;
	}
}