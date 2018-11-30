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
 * @author luoZheng
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
