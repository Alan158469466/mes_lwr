package com.tl.mes.util;

import java.io.Serializable;

/**
 * 该类作为服务端处理请求后返还对象，经JSON封装后返还给页面
 * @author Alan
 */

public class Result implements Serializable {

	private static final long serialVersionUID = 6230685303795905683L;

	private Integer status;	//0代表成功,其他失败
	private String msg; //消息
	private Object data; //返回的数据
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Resut [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
	
	public Result(){
	}
	public Result(Integer status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	
	
}
