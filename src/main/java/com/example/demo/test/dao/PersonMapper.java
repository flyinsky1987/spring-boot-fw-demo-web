package com.example.demo.test.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public 	interface PersonMapper {
	/**
	 * 获取全部数量
	 */
	int getCount();
}
