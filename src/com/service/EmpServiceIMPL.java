package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmpDao;
import com.model.EmpModel;

@Service
public class EmpServiceIMPL implements EmpService
{
	@Autowired
	private EmpDao dao;
	
	@Transactional
	@Override
	public void addEmp(EmpModel em) {
		// TODO Auto-generated method stub
		dao.addEmp(em);
		//System.out.println(em);
		
	}

	
	

}
