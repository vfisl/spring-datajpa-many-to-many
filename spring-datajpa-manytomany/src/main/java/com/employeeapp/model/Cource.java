package com.employeeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Cource {

	@Id
	@GeneratedValue(generator = "cource_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "cource_gen",initialValue = 100,allocationSize = 1)
	private Integer courceId;
	@Column(name = "courcename" ,length = 20)
	private String courceName;
	@Column(length = 20)
	private String duration;
	@Column(length = 20)
	private String category;
	@ManyToMany(fetch = FetchType.EAGER,mappedBy = "cource")
	private Set<Employee> employee;
	public Cource() {
		super();
	}
	public Cource(String courceName, String duaration, String category) {
		super();
		this.courceName = courceName;
		this.duration = duaration;
		this.category = category;
	}
	public Integer getCourceId() {
		return courceId;
	}
	public void setCourceId(Integer courceId) {
		this.courceId = courceId;
	}
	public String getCourceName() {
		return courceName;
	}
	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}
	public String getDuaration() {
		return duration;
	}
	public void setDuaration(String duaration) {
		this.duration = duaration;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Cource [courceId=" + courceId + ", courceName=" + courceName + ", duaration=" + duration
				+ ", category=" + category + "]";
	}
	
	
}
