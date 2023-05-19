package com.sf.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.employee.bean.Emp;
import com.sf.employee.service.EmployeeService;






@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	@Autowired
	private EmployeeService eserv;
	@PostMapping("/addEmp")
	public String addEmployee(@RequestBody Emp emp) {
		System.out.println(emp);
		return eserv.addEmployee(emp);
	}
	@GetMapping("/getEmp")
	public List<Emp> viewEmployee(){
		return eserv.viewEmployee();
	}
	@PutMapping("/updateEmp")
	public boolean modifyEmployee(@RequestBody Emp emp) {
		return eserv.modifyEmployee(emp);
	}
	@DeleteMapping("/deleteEmp/{Code}")
	public String deleteEmployee(@PathVariable(value="Code") String EmpCode)
	{
		return eserv.deleteEmployee(EmpCode)+" record deleted successfully";
	}

}