package com.placement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlacementEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sNo;
	@Column
	String name;
	@Column
	String email;
	@Column
	Long phoneno;
	@Column
	String city;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
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
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "PlacementEntity [sNo=" + sNo + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno
				+ ", city=" + city + "]";
	}
	public PlacementEntity(int sNo, String name, String email, Long phoneno, String city) {
		super();
		this.sNo = sNo;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.city = city;
	}
	public PlacementEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
