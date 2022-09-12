package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByCity(String city);
//	@Query("from Hotel h inner join h.itemList  i where i.itemName=?1")
	@Query("from Employee e inner join e.cource c where c.courceName=?1 ")
	List<Employee> findByCourceName(String courceName);
	@Query("from Employee e inner join e.cource c where c.category=?1 ")
	List<Employee> findByCourceCategory(String category);
	
	@Query("from Employee e inner join e.cource c where c.courceName=?1 or c.duration=?2 ")
	List<Employee> findByCourceNameDuration(String courceName,String duration);
}
