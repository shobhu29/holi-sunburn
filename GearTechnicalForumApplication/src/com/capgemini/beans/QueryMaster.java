package com.capgemini.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;

@Entity
@Table(name = "query_master")
@NamedEntityGraph(name = "joined", includeAllAttributes = true)
public class QueryMaster {
	
	@Id
	@NotEmpty(message = "Enter valid Query ID")
	@Pattern(regexp = "[1-9][0-9]{1,2}", message = "Query ID Should be in 1 or 2 digits")
	private int query_id;

	@NotEmpty(message = "Enter valid technology")
	private String technology;
	
	private String query_raised_by;
	
	private String query;
	
	private String solutions;
	
	private String solution_given_by;

	public QueryMaster() {}

	public QueryMaster(int query_id, String technology, String query_raised_by, String query, String solutions,
			String solution_given_by) {
		super();
		this.query_id = query_id;
		this.technology = technology;
		this.query_raised_by = query_raised_by;
		this.query = query;
		this.solutions = solutions;
		this.solution_given_by = solution_given_by;
	}



	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQuery_raised_by() {
		return query_raised_by;
	}

	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}

	public String getQuery() {
		return query;
	}
	
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSolutions() {
		return solutions;
	}

	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}

	public String getSolution_given_by() {
		return solution_given_by;
	}

	public void setSolution_given_by(String solution_given_by) {
		this.solution_given_by = solution_given_by;
	}
}
