package com.klef.soa.exam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PetGroomingCenter")
public class PetGroomingCenter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,unique = true)
	private String centerName;
	@Column(nullable = false)
	private String location;
	@Column(nullable = false)
	private int servicecount;
	@Column(nullable = false)
	private boolean open;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getServicecount() {
		return servicecount;
	}
	public void setServicecount(int servicecount) {
		this.servicecount = servicecount;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "PetGroomingCenter [id=" + id + ", centerName=" + centerName + ", location=" + location
				+ ", servicecount=" + servicecount + ", open=" + open + "]";
	}
	

}
