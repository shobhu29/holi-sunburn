package com.capgemini.service;

import com.capgemini.beans.QueryMaster;

public interface QueryService {

	public Iterable<QueryMaster> findAll();

}
