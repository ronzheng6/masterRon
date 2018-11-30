package com.ronzheng.travel.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronzheng.travel.entity.SpotInfo;
import com.ronzheng.travel.service.SpotService;
import com.ronzheng.travel.utils.RedisUtil;
/**
 * 景点信息
 * @author luozheng
 *
 */
@RestController
@RequestMapping("spot")
public class SpotController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	SpotService spotService;
	@Autowired
	RedisUtil redisUtil;
	/**
	 * 查询所有景点
	 * @return
	 */
	@RequestMapping("findSpotAll")
	public List<SpotInfo> findSpotAll(){
		List<SpotInfo> list = new ArrayList<>();
		String redis = (String) redisUtil.get("spotInfo");
		if(redis!=""&& redis!=null) {
			logger.info("从redis取值"+redis);
			String[] info = redis.split(",");
			SpotInfo spotInfo = new SpotInfo();
			spotInfo.setId(Integer.parseInt(info[0]));
			spotInfo.setSpotName(info[1]);
			spotInfo.setSpotIntroduce(info[2]);
			spotInfo.setCreateTime(info[3]);
			spotInfo.setCreateby(info[4]);
			spotInfo.setUpdateTime(info[5]);
			spotInfo.setUpdateby(info[6]);
			list.add(spotInfo);
		}else {
			logger.info("查询景点start");
			list = spotService.findSpotAll();
			logger.info("查询景点结果："+list);
			logger.info(list.get(0).toString());
			redisUtil.set("spotInfo", list.get(0).toString(), 300);
		}
		return list;
	}
}
