package com.lit.appl.vehicleloan.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLES")
public class Vehicle {

	@Id
	@Column(name="VEHICLENUMBER",unique=true)
	private String vehicleNumber;
	
	
	@Column(name="VEHICLEID")
	private int vehicleId;
	
	@Column(name="VEHICLEMAKE")
	private String vehicleMake;
	
	@Column(name="VEHICLEMODEL")
	private int vehicleModel;
	
	@Column(name="EXPRICE")
	private long exPrice;
	
	@Column(name="ONROADPRICE")
	private long onRoadprice;
	
	
	
	@OneToOne
	@JoinColumn(name="CUSTID")
	private Customer c;

	public Vehicle(int vehicleId, String vehicleMake, int vehicleModel, long exPrice, long onRoadprice,
			String vehicleNumber, Customer c) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.exPrice = exPrice;
		this.onRoadprice = onRoadprice;
		this.vehicleNumber = vehicleNumber;
		this.c = c;
	}

	public Vehicle() {
		super();
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public int getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public long getExPrice() {
		return exPrice;
	}

	public void setExPrice(long exPrice) {
		this.exPrice = exPrice;
	}

	public long getOnRoadprice() {
		return onRoadprice;
	}

	public void setOnRoadprice(long onRoadprice) {
		this.onRoadprice = onRoadprice;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleMake=" + vehicleMake + ", vehicleModel=" + vehicleModel
				+ ", exPrice=" + exPrice + ", onRoadprice=" + onRoadprice + ", vehicleNumber=" + vehicleNumber + ", c="
				+ c + "]";
	}
	
	

	
}
