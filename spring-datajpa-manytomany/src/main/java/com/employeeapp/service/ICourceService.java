package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Cource;
import com.employeeapp.model.Employee;

public interface ICourceService {

	Cource addEmployee(Cource cource);
	void updateEmployee(Cource cource);
	void deleteEmployee(int courceId);
	List<Cource> getAll();
	Cource getById(int courceId);
	
	List<Cource> getByCity(String city);
	List<Cource> getByEmployee(String name);
	List<Cource> getByCategory(String category);
}
