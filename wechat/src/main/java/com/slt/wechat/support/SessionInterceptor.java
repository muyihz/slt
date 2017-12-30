package com.slt.wechat.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SessionInterceptor implements HandlerInterceptor{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
	}
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object obj) throws Exception {
		/*String testKey = req.getParameter("testKey");
		logger.info("session 拦截器,检查session有效性===="+testKey);
		String sessionId = RequestUtil.getCookieByKey(req,CommonParamConfig.COMMMON_SESSION_ID);
		ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
		String userJsonStr = valueOperations.get(CommonParamConfig.COMMMON_SESSION_ID+"_"+sessionId.toUpperCase());
		if(userJsonStr==null || userJsonStr.trim().length()<=0){
			resp.getWriter().write("未登录，认证失败");
			resp.setStatus(401);
			return false;
		}
		JSONObject userJson =JSONObject.parseObject(userJsonStr);
		req.setAttribute("_userJson", userJson);*/
		return true;
	}

}
