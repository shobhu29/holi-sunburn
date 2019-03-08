package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.beans.QueryMaster;

@Repository
public interface QueryRepo extends CrudRepository<QueryMaster,Integer> {

}
