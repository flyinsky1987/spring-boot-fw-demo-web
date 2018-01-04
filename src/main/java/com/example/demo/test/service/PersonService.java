package com.example.demo.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.test.dao.PersonMapper;

@Service
@Transactional
public class PersonService {
	@Autowired
	private PersonMapper dao;
	public int getCount(){
		return dao.getCount();
	}
}
