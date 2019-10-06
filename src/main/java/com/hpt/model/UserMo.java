package com.hpt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserMo {
	
	@Id
	private int id;
	private String firtsName;
	private String lastName;
	private boolean sexe;
	private String picturePath;
	private String password;
	private boolean state;
	private boolean userType;
	
	public UserMo() {
		
	}
	public UserMo(int id, String firtsName, String lastName, boolean sexe, String picturePath, String password,
			boolean state, boolean userType) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.sexe = sexe;
		this.picturePath = picturePath;
		this.password = password;
		this.state = state;
		this.userType = userType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isSexe() {
		return sexe;
	}
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public boolean isUserType() {
		return userType;
	}
	public void setUserType(boolean userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "UserMo [id=" + id + ", firtsName=" + firtsName + ", lastName=" + lastName + ", sexe=" + sexe
				+ ", picturePath=" + picturePath + ", password=" + password + ", state=" + state + ", userType="
				+ userType + "]";
	}	
}
