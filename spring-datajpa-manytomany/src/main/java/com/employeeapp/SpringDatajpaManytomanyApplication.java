package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Cource;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourceService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}


	IEmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	ICourceService courceService;
	@Autowired
	public void setCourceService(ICourceService courceService) {
		this.courceService = courceService;
	}



	@Override
	public void run(String... args) throws Exception {

		
		Employee employee=new Employee("Virat", "Bangalore", "Digital");
		
		Cource cource2=courceService.getById(100);
		Cource cource3=courceService.getById(101);
//		
		Set<Cource> cources=new HashSet<>(Arrays.asList(cource2,cource3));
		employee.setCource(cources);
		
		employeeService.addEmployee(employee);
	}

}
