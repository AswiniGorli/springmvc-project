package com.example.demo.services;

import java.util.List;

import com.example.demo.models.springmvc;

public interface springmvcservice  {
	
	List<springmvc> getall();
	void adduser(springmvc s );
	springmvc getbyid(long id);
	void deletebyid(long id);
	
	

}
