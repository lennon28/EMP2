package com.sf.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.employee.bean.Emp;



@Repository

public class EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	

	public String addEmp(Emp emp) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save(emp);
		transaction.commit();
		session.close();
		return "success";
		
	} 
	public List<Emp> viewEmp(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from Emp");
		return (ArrayList<Emp>) q.list();
		
	}
	public boolean modifyEmp(Emp emp) {
	    boolean isSuccess = true;
	    try {
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        session.update(emp);
	        transaction.commit();
	        session.close();
	    } catch (Exception e) {
	        isSuccess = false;
	        e.printStackTrace();
	    }
	    return isSuccess;
	}
	public String deleteEmp(String EmpCode){
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query q=session.createQuery("delete from Emp where EmpCode=:EmpCode");
		q.setParameter("EmpCode",EmpCode);
		q.executeUpdate();
        transaction.commit();
        return "SUCCESS";
	}
}

	