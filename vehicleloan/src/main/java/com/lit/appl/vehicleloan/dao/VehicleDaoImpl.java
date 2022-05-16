package com.lit.appl.vehicleloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lit.appl.vehicleloan.beans.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void addVehicle(Vehicle vid) {
	
		System.out.println(vid.toString());
		em.persist(vid);
		
	}

}
