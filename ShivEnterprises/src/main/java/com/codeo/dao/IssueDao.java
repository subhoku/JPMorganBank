package com.codeo.dao;

import java.util.List;

import com.codeo.entity.Issues;

public interface IssueDao {

List<Issues> get();
	
	Issues get(int id);
	
	boolean save(Issues issues);
	
	boolean delete(int id);
	
	boolean update(Issues issues);
	
	void emailFunctionality();
}
