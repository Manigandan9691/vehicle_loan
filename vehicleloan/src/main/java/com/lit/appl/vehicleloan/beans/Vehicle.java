package com.lit.appl.vehicleloan.beans;

public class Vehicle {

	private int vehicleId;
	private String vehicleMake;
	private int vehicleModel;
	private long exPrice;
	private long onRoadprice;
	private char vehicleNumber;
	
	public Vehicle(int vehicleId, String vehicleMake, int vehicleModel, long exPrice, long onRoadprice,
			char vehicleNumber) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.exPrice = exPrice;
		this.onRoadprice = onRoadprice;
		this.vehicleNumber = vehicleNumber;
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

	public char getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(char vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleMake=" + vehicleMake + ", vehicleModel=" + vehicleModel
				+ ", exPrice=" + exPrice + ", onRoadprice=" + onRoadprice + ", vehicleNumber=" + vehicleNumber + "]";
	}
	
	
	
	
}
