package com.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.EmpModel;

@Repository
public class EmpDaoIMPL implements EmpDao 
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addEmp(EmpModel em) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(em);
		
	}

	

	

}
