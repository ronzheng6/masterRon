package com.ronzheng.travel.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ronzheng.travel.entity.SpotInfo;
@Component
public interface SpotInfoMapper {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(SpotInfo record);
//
//    int insertSelective(SpotInfo record);
//
//    SpotInfo selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(SpotInfo record);
//
//    int updateByPrimaryKey(SpotInfo record);
	//查找所有景点
	List<SpotInfo> findSpotAll();
}