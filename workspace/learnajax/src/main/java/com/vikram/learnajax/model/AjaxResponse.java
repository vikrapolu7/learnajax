package com.vikram.learnajax.model;

public class AjaxResponse {
	
	private String status;
	private Object data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public AjaxResponse(String status, Object data) {
		
		this.status = status;
		this.data = data;
	}
	@Override
	public String toString() {
		return "AjaxResponse [status=" + status + ", data=" + data + "]";
	}
	
	
	
	
}
