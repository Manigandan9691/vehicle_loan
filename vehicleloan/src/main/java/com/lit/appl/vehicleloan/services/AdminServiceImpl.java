package com.lit.appl.vehicleloan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lit.appl.vehicleloan.beans.Admin;
import com.lit.appl.vehicleloan.dao.AdminDao;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao dao;
	
	
	public AdminDao getDao() {
		return dao;
	}


	public void setDao(AdminDao dao) {
		this.dao = dao;
	}


	@Override
	public void addAdmin(Admin aid) {
		dao.addAdmin(aid);
		
	}

}
