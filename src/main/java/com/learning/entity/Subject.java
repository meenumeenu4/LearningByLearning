/**
 * 
 */
package com.learning.entity;

import java.io.Serializable;

/**
 * @author bhatiam0
 *
 */


public class Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer subjectId;


	private String name;

	private String description;

	protected Subject() {
		// no-argument constructor is required by JPA
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
