package com.codeo.entity;

public class Issues {

	private Integer id;
	private String issuetitle=null;
	private String openedby=null;
	private String dateopened=null;
	private String datefixed=null;
	private String priority=null;
	private String status=null;
	private String comments=null;
	public Issues(Integer id, String issuetitle, String openedby, String dateopened, String datefixed, String priority,
			String status, String comments) {
		super();
		this.id = id;
		this.issuetitle = issuetitle;
		this.openedby = openedby;
		this.dateopened = dateopened;
		this.datefixed = datefixed;
		this.priority = priority;
		this.status = status;
		this.comments = comments;
	}
	public Issues(String issuetitle, String openedby, String dateopened, String datefixed, String priority,
			String status, String comments) {
		super();
		this.issuetitle = issuetitle;
		this.openedby = openedby;
		this.dateopened = dateopened;
		this.datefixed = datefixed;
		this.priority = priority;
		this.status = status;
		this.comments = comments;
	}
	public Issues() {
		super();
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIssuetitle() {
		return issuetitle;
	}
	public void setIssuetitle(String issuetitle) {
		this.issuetitle = issuetitle;
	}
	public String getOpenedby() {
		return openedby;
	}
	public void setOpenedby(String openedby) {
		this.openedby = openedby;
	}
	public String getDateopened() {
		return dateopened;
	}
	public void setDateopened(String dateopened) {
		this.dateopened = dateopened;
	}
	public String getDatefixed() {
		return datefixed;
	}
	public void setDatefixed(String datefixed) {
		this.datefixed = datefixed;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Issues [id=" + id + ", issuetitle=" + issuetitle + ", openedby=" + openedby + ", dateopened="
				+ dateopened + ", datefixed=" + datefixed + ", priority=" + priority + ", status=" + status
				+ ", comments=" + comments + "]";
	}
	
	
	
}
