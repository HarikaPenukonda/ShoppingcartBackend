package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import  javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity 
@Table(name= "Category2")//if table name and domain class name is same,no need to specify
@Component

public class Category{
	
	/**id,name,description are the feilds in the table **/
	
	@Id
	private String id;
	
	@Min(5)
	@Max(15)
	private String Name;
	
	@NotNull
    private String description;
    
   // private string createdBy;
	
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	


	}


