package com.Rest.RestWebService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class Course {
	
	@Id
	private long id=0;
	
	private String titleString=null;
	private  String description=null;
	//private String description2=null;
	
	
	public Course(long id, String titleString, String description) {
		super();
		this.id = id;
		this.titleString = titleString;
		this.description = description;
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleString() {
		return titleString;
	}

	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titleString=" + titleString + ", description=" + description + "]";
	}

	public Course() {
		super();
	}
	
}
