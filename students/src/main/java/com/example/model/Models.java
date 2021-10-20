package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="details")
public class Models {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	Integer Id;
	@Column(name="first_name")
    String first_name;
	@Column(name="last_name")
	String last_name;
	
	
	public Models() {
		super();
		
	}
	public Models(Integer id, String first_name, String last_name) {
		super();
		Id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public Models(String first_name, String last_name) {
		super();
		
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	@Override
	public String toString() {
		return "Models [Id=" + Id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	

}
