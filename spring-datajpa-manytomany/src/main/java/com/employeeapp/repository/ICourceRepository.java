package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Cource;
@Repository
public interface ICourceRepository extends JpaRepository<Cource, Integer>{

//	@Query("from Hotel h inner join h.itemList  i where i.itemName=?1")
	@Query("from Cource c inner join c.employee e where e.city=?1")
	List<Cource> findByCity(String city);
	@Query("from Cource c inner join c.employee e where e.employeeName=?1")
	List<Cource> findByEmployee(String name);
	List<Cource> findByCategory(String category);

}
