package com.employeeapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.IEmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {

		employeeRepository.deleteById(employeeId);
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getById(int employeeId) {
		Optional<Employee> employeelist=employeeRepository.findById(employeeId);
		if(employeelist.isPresent())
			return employeelist.get();
		return null;
	}

	@Override
	public List<Employee> getByCity(String city) {
		return employeeRepository.findByCity(city);
	}

	@Override
	public List<Employee> getByCourceName(String courceName) {
		return employeeRepository.findByCourceName(courceName);
	}

	@Override
	public List<Employee> getByCourceCategory(String category) {
		
		return employeeRepository.findByCourceCategory(category);
	}

}
