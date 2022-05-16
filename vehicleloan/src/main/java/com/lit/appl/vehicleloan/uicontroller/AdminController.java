package com.lit.appl.vehicleloan.uicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lit.appl.vehicleloan.beans.Admin;
import com.lit.appl.vehicleloan.services.AdminServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminServiceImpl adminService;
	
	@PostMapping("/addadmin")
	public void addCust(@RequestBody  Admin aid)
	{
		adminService.addAdmin(aid);
	}
/*	public boolean logAdmin(@RequestBody Admin alogin)
	{
		System.out.println("login");
		return true;
	}*/
}
