package com.hpt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PieceMo {

	@Id
	private int id;
	private String name;
	private String description;
	
	@ManyToOne
	private UserMo userMo;	
	
	public PieceMo() {
		
	}

	public PieceMo(int id, String name, String description, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.userMo = new UserMo(userId,"","",false,"","",false,false);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public UserMo getUserMo() {
		return userMo;
	}
	public void setUserMo(UserMo userMo) {
		this.userMo = userMo;
	}

	@Override
	public String toString() {
		return "PieceMo [id=" + id + ", name=" + name + ", description=" + description + ", userMo=" + userMo + "]";
	}
	 
	
	
	
}
