package com.employeeapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Cource;
import com.employeeapp.model.Employee;
import com.employeeapp.repository.ICourceRepository;
@Service
public class CourceServiceImpl implements ICourceService {

	@Autowired
	ICourceRepository courceRepository;
	
	@Override
	public Cource addEmployee(Cource cource) {
		return courceRepository.save(cource);
	}

	@Override
	public void updateEmployee(Cource cource) {
		courceRepository.save(cource);
	}

	@Override
	public void deleteEmployee(int courceId) {

		courceRepository.deleteById(courceId);
	}

	@Override
	public List<Cource> getAll() {
		return courceRepository.findAll();
	}

	@Override
	public Cource getById(int courceId) {
		Optional<Cource> cources=courceRepository.findById(courceId);
		if(cources.isPresent())
			cources.get();
		return null;
				
	}

	@Override
	public List<Cource> getByCity(String city) {
		return courceRepository.findByCity(city);
	}

	@Override
	public List<Cource> getByEmployee(String name) {
		return courceRepository.findByEmployee(name);
	}

	@Override
	public List<Cource> getByCategory(String category) {
		return courceRepository.findByCategory(category);
	}

}
