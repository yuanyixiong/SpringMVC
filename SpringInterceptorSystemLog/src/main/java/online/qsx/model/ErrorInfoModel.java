package online.qsx.model;

import java.util.Date;

public class ErrorInfoModel {
	// 错误发生的时间
	private Date createDate;
	// 错误的信息
	private String info;
	// 错误的位置
	private String location;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ErrorInfoModel(Date createDate, String info, String location) {
		super();
		this.createDate = createDate;
		this.info = info;
		this.location = location;
	}

	public ErrorInfoModel() {
		super();
	}

}
