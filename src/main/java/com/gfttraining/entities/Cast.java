package com.gfttraining.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cast extends Credit {

	private Integer cast_id;
	private String character;
	private String credit_id;
	private Integer order;


	public Cast(){}

	public Cast(boolean adult, Integer gender, String known_for_department, String name, String original_name,
				double popularity, Integer cast_id, String character, String credit_id, Integer order) {
		super(adult, gender, known_for_department, name, original_name, popularity);
		this.cast_id = cast_id;
		this.character = character;
		this.credit_id = credit_id;
		this.order = order;
	}


	public Integer getCast_id() {
		return cast_id;
	}
	public void setCast_id(Integer cast_id) {
		this.cast_id = cast_id;
	}

	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}

	public String getCredit_id() {
		return credit_id;
	}
	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}

	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "Cast{" +
				"cast_id=" + cast_id +
				", character='" + character + '\'' +
				", credit_id='" + credit_id + '\'' +
				", order=" + order +
				'}';
	}
}
