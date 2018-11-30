package com.ronzheng.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ronzheng.travel.dao.SpotInfoMapper;
import com.ronzheng.travel.entity.SpotInfo;
/**
 * 景点信息
 * @author luozheng
 *
 */
@Service
//@CacheConfig(cacheNames="spotCatch")
public class SpotService {
	@Autowired
	SpotInfoMapper spotInfoMapper;
	/**
	 * 查询所有的景点
	 * @return
	 */
//	@Cacheable(key = "getMethodName()")
	public List<SpotInfo> findSpotAll(){
		return spotInfoMapper.findSpotAll();
	}
}
