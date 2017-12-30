package com.slt.wechat.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slt.wechat.entity.TextMessage;
import com.slt.wechat.util.XmlUtil;

@Controller
@EnableAutoConfiguration
public class WechatController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/wechat",method=RequestMethod.GET)
	@ResponseBody
	public String wechatGet(HttpServletRequest request, HttpServletResponse resp) throws Exception{
		
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
	
	
	@RequestMapping(value="/wechat",method=RequestMethod.POST)
	@ResponseBody
	public String wechatPost(HttpServletRequest request, HttpServletResponse resp) throws Exception{
		Map<String,String> map = XmlUtil.xml2Map(request);
		logger.info("map == " +  map);
		// 发送方帐号（一个OpenID）
        String fromUserName = map.get("FromUserName");
        // 开发者微信号
        String toUserName = map.get("ToUserName");
        // 消息类型
        String msgType = map.get("MsgType");
        // 消息内容
        String msg = map.get("Content");
        // 默认回复一个"success"
        
        
        String retContent = "";
        if("hello".equalsIgnoreCase(msg)) {
        	retContent = "you too";
        }else if("sb".equalsIgnoreCase(msg)) {
        	retContent = "hehe " + msg;
        }else if("兑换".equalsIgnoreCase(msg)) {
        	retContent = "http://121.42.147.37:8080/index.html";
        }else {
        	retContent = "我从来中来，去往去中去";
        }
        
       
        TextMessage message = new TextMessage();
        message.setFromUserName(toUserName);
        message.setToUserName(fromUserName);
        message.setMsgType(msgType);
        message.setContent(retContent);
        message.setCreateTime(System.currentTimeMillis());
        String ret = XmlUtil.textMessageToXml(message);
        logger.info("ret == " +  ret);
		return ret;
	}
}
