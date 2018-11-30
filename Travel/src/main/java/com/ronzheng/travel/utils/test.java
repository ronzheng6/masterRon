package com.ronzheng.travel.utils;

import java.util.ArrayList;
import java.util.List;

import com.ronzheng.travel.entity.SpotInfo;

/** 
* @author 作者 luozheng: 
* @version 创建时间：2018年11月30日 下午12:24:21 
* 类说明 
*/
public class test {
	public static void main(String[] args) {
//		SpotInfo spot = new SpotInfo();
//		spot.setSpotIntroduce("sfsd");
//		spot.setSpotName("sd");
//		System.out.println(spot.toString());
		
		String redis ="[id=1,spotName=s,spotIntroduce=s,createTime=2018-11-23 20:04:57,createby=s,updateTime=2018-11-30 20:05:00,updateby=s]";
		String[] info = redis.split(",");
//		System.out.println(info[0]);
//		System.out.println(info[1]);
		SpotInfo spotInfo = new SpotInfo();
		List<Object> list = new ArrayList<>();
//		list.add(1);
//		System.out.println(list);
		for(String s:info) {
//			spotInfo.setId(Integer.parseInt(info[0]));
//			spotInfo.setSpotName(info[1]);
//			spotInfo.setSpotIntroduce(info[2]);
//			spotInfo.setCreateTime(info[3]);
//			spotInfo.setCreateby(info[4]);
//			spotInfo.setUpdateTime(info[5]);
//			spotInfo.setUpdateby(info[6]);
			list.add(s);
		}
		List<SpotInfo> listspot = new ArrayList<>();
//		list.add(spotInfo);
		System.out.println(list);
	}
}
