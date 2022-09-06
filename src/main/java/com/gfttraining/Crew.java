package com.gfttraining;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Crew extends Credit {

	private String job;
	private String department;


	public Crew(){}

	public Crew(boolean adult, Integer gender, String known_for_department, String name, String original_name,
				double popularity, String job, String department) {
		super(adult, gender, known_for_department, name, original_name, popularity);
		this.job = job;
		this.department = department;
	}


	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
