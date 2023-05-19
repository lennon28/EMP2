package com.sf.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.employee.bean.BankBranch;
@Repository
public class BankBranchDao {
	@Autowired
	private SessionFactory sessionfactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	
	
	public List<BankBranch> getAll(){
		session = sessionfactory.openSession();
		transaction = session.beginTransaction();
		Query q = session.createQuery("FROM BankBranch");
		List<BankBranch> bankBranches = q.list();
		transaction.commit();
		session.close();
		return bankBranches;
	}


}
