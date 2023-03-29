package com.bs.hw.employee.controller;

import com.bs.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e;
	
	
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo, name, gender, phone);
//		e.setEmpNo(empNo);
//		e.setName(name);
//		e.setGender(gender);
//		e.setPhone(phone);
	}
	
	public void add(int empNo, String name, char gender, String phone,
			String dept, int salary, double bonus) {
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalalry(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e = null;
		return e;
	}
	
	public String inform() {

		if(e == null) {
			return null;
		}else {
			return e.getEmpNo()+" "+e.getName() + " "+e.getGender() + " "+
					e.getPhone() + " "+e.getDept() + " "+ e.getSalary() + " "+
					e.getBonus();
		}
		
	}
	
}


