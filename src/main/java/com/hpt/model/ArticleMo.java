package com.hpt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ArticleMo {	

	@Id
	private int id;
	private String name;
	private double price;
	private int qte;
	private String description;
	private String picturePath;
	private boolean state;
	
	@ManyToOne
	private PieceMo pieceMo;
	
	@ManyToOne
	private UserMo userMo;
	
	public ArticleMo() {
		
	}
	public ArticleMo(int id, String name, double price, int qte, String description, String picturePath,
			boolean state, int pieceId, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qte = qte;
		this.description = description;
		this.picturePath = picturePath;
		this.state = state;
		this.pieceMo = new PieceMo(pieceId, "", "", userId);
		this.userMo = new UserMo(userId, "", "", false, "", "",false,false);
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}	
	public PieceMo getPieceMo() {
		return pieceMo;
	}
	public void setPieceMo(PieceMo pieceMo) {
		this.pieceMo = pieceMo;
	}
	
	public UserMo getUserMo() {
		return userMo;
	}
	public void setUserMo(UserMo userMo) {
		this.userMo = userMo;
	}
	
	@Override
	public String toString() {
		return "ArticleMo [id=" + id + ", name=" + name + ", price=" + price + ", qte=" + qte + ", description="
				+ description + ", picturePath=" + picturePath + ", state=" + state + ", pieceMo=" + pieceMo
				+ ", userMo=" + userMo + "]";
	}		
}
