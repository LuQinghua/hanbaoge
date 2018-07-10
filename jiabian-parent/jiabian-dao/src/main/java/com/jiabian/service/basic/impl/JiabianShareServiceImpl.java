package com.jiabian.service.basic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.beans.basic.JiabianShare;
import com.jiabian.dao.basic.JiabianShareMapper;
import com.jiabian.service.basic.IJiabianShareService;
/**
 * 
 * JiabianShareServiceImpl
 * 创建人:熊天威
 * 时间：2017年3月9日-下午1:39:57 
 * @version 1.0.0
 *
 */
@Service
public class JiabianShareServiceImpl implements IJiabianShareService{
	@Autowired
	JiabianShareMapper jiabianShareMapper;

	//xtw
	@Override
	public int insertShareUserInfo(JiabianShare share) {
		return jiabianShareMapper.insertSelective(share);
	}

}
