package com.tl.mes.entity;

import java.io.Serializable;

/**
 * 该实体类作为测试类
 * @author Alan
 */
public class User implements Serializable {

	private static final long serialVersionUID = 70757920159329042L;
	
	private String id;
	private String name;
	private String password;
	private String nick;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", nick=" + nick + "]";
	}
	
	public User(){
	}
	public User(String id, String name, String password, String nick) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.nick = nick;
	}
	
	
	

}
