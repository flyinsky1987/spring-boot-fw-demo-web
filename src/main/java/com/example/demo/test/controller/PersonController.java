package com.example.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	/**
	 * http://localhost:8080
	 * */
	@RequestMapping(value = {"/"}, method = {RequestMethod.GET})
	public String index(){
		return "welcome!";
	}
	
	
	/**
	 * http://localhost:8080/index/hello/付小平
	 */
	@RequestMapping(value = {"/hello/{name}"}, method = {RequestMethod.GET})
	public String hello(@PathVariable String name){
		return "hello"+name;
	}
	
	
	/**
	 * http://localhost:8080/index/test?name=付小平&sex=男&age=12
	 */
	@RequestMapping(value = {"/test"}, method = {RequestMethod.GET})
	public String test(@RequestParam String name,@RequestParam String sex,@RequestParam int age){
		return String.format("姓名：%s,性别：%s,年龄：%d", name,sex,age);
	}
	
	@RequestMapping(value = {"/getCount"}, method = {RequestMethod.GET})
	public String getCount(){
		return String.format("查询记录数量：%d", service.getCount());
	}
}
