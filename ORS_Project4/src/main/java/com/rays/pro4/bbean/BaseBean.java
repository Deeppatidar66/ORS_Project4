package com.rays.pro4.bbean;

import java.io.Serializable;

import com.google.protobuf.Timestamp;
import com.rays.pro4.Bean.DropdownListBean;

public abstract class BaseBean  implements Serializable,DropdownListBean,Comparable<BaseBean>{
	
	protected long id;
	protected String createdBy;
	protected String modifiedBy;
	protected Timestamp createdDatetTime;
	protected Timestamp modifiedDateTimes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getCreatedDatetTime() {
		return createdDatetTime;
	}
	public void setCreatedDatetTime(Timestamp createdDatetTime) {
		this.createdDatetTime = createdDatetTime;
	}
	public Timestamp getModifiedDateTimes() {
		return modifiedDateTimes;
	}
	public void setModifiedDateTimes(Timestamp modifiedDateTimes) {
		this.modifiedDateTimes = modifiedDateTimes;
	}
	

}
