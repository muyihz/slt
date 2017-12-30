package com.slt.wechat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slt.wechat.dao.UserInfoDao;
import com.slt.wechat.entity.UserInfo;
import com.slt.wechat.support.CommonParamConfig;
import com.slt.wechat.util.JsonUtil;

@Controller
@EnableAutoConfiguration
public class UserInfoController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserInfoDao userInfoDao;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String test() throws Exception{
		logger.info("======================= ============= " );
		return "1111111111111111";
	}
	
	@RequestMapping(value="/checkToken")
	@ResponseBody
	public String cheakToken(HttpServletRequest request, HttpServletResponse resp) throws Exception{
		
		//signature
		String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        //随机数
        String nonce = request.getParameter("nonce");
        //随机字符串
        String echostr = request.getParameter("echostr");
        
        logger.info(signature + "==" +  timestamp + "==" + nonce + "==" + echostr);
		return echostr;
	}
	
	
	@RequestMapping(value="/userinfo")
	@ResponseBody
	public String userInfo() throws Exception{
		UserInfo userInfo = userInfoDao.getUserInfo(1L);
		String jsonStr = JsonUtil.obj2Json(userInfo).toJSONString();
		logger.info(JsonUtil.obj2Json(userInfoDao.getUserInfo(1L)).toJSONString());
		return jsonStr;
	}
	
	@RequestMapping(value="/redis")
	@ResponseBody
	public String redis(){
		stringRedisTemplate.opsForValue().set("testRedis", "dadasdsadasdasdadadasdadasddadasadaadaa");
		String testRedis = stringRedisTemplate.opsForValue().get("testRedis");
		logger.info(testRedis);
		return testRedis;
	}
	
	@RequestMapping(value="/publish")
	@ResponseBody
	public String publish(@RequestParam(value = "message", required = true) String message){
		logger.info("发布信息 ====== " + message);
		stringRedisTemplate.convertAndSend(CommonParamConfig.COMMMON_TEST_CHANNEL, message);
		return message;
	}
	
}
