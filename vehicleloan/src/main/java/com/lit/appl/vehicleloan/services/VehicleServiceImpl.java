package com.lit.appl.vehicleloan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Vehicle;
import com.lit.appl.vehicleloan.dao.VehicleDao;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao dao;
	
	
	public VehicleDao getDao() {
		return dao;
	}


	public void setDao(VehicleDao dao) {
		this.dao = dao;
	}


	public void addVehicle(Vehicle vid) {
		dao.addVehicle(vid);
	}
}
