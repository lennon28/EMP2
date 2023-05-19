package com.sf.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.employee.bean.Emp;
import com.sf.employee.dao.EmployeeDao;




@Service
public class EmployeeService {
@Autowired

private EmployeeDao edao;

public String addEmployee(Emp emp) {
	return edao.addEmp(emp);
}
public List<Emp> viewEmployee(){
	return edao.viewEmp();
}
public boolean modifyEmployee(Emp emp) {
	return edao.modifyEmp(emp);
}
public String deleteEmployee(String EmpCode)
{
	return edao.deleteEmp(EmpCode);
}
}
