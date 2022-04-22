package com.AshokIt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="/CONTACT_DTLS")
public class Contact {
	
	@Id
	@GeneratedValue
	private int cId;
	
	private String name;
	private String email;
	private long phoneNo;
	private String activeSw;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", activeSw="
				+ activeSw + "]";
	}
	

}
