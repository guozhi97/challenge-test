package com.gz.icms.pojo;

import java.io.Serializable;
public class TbAdministrator implements Serializable {
/*create by gz*/

	private String id;

	private String name;

	private String password;

	private String email;

	private String tell;

	public TbAdministrator() {}

	@Override
	public String toString(){
		return "TbAdministrator [id=" + id + ",name=" + name + ",password=" + password + ",email=" + email + ",tell=" + tell + "]";
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}
}