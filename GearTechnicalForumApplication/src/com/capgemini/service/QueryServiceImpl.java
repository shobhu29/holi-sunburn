
package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.beans.QueryMaster;
import com.capgemini.repo.QueryRepo;


@Component
public class QueryServiceImpl implements QueryService {

	@Autowired
	private QueryRepo repo;

	@Override
	public Iterable<QueryMaster> findAll() {

		return repo.findAll();
	}



}