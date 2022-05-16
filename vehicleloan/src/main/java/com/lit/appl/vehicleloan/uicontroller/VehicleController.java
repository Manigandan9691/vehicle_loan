package com.lit.appl.vehicleloan.uicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lit.appl.vehicleloan.beans.Vehicle;
import com.lit.appl.vehicleloan.services.VehicleServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleServiceImpl vehicleServ;
	
	//http://localhost:8282/vehicle/addvehicle
	@PostMapping(path="/addvehicle",produces="application/json",consumes="application/json")
	public void addVehicle(@RequestBody Vehicle vid)
	{
		System.out.println(vid);
		vehicleServ.addVehicle(vid);
	}

}
