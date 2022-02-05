package com.stump.ducks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duck {
	
	
	private @Id @GeneratedValue Long id;
	
	private String name;
	
	public Duck() {
	}

	public Duck(String name) {
		super();
		this.name = name;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	  @Override
	  public String toString() {
	    return String.format(
	        "Duck[id=%d, firstName='%s']",
	        id, name);
	  }
	
	

}
