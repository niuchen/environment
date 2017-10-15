package com.environment.service;


import com.environment.domain.NewsInfo;

import java.util.List;

public interface NewService {
	
	/**
	 * findAll
	 * @param pageNo
	 */
	List<NewsInfo> findAll(int pageNo);
	
	/**
	 * findCount
	 */
	int findCount();
	
	/**
	 * 查询一条记录
	 * @param id
	 * @return
	 */
	NewsInfo findOne(int id);
	
	/**
	 * save
	 * @param info
	 */
	void save(NewsInfo info);
}
