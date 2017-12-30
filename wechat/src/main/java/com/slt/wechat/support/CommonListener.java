package com.slt.wechat.support;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
@Component
public class CommonListener implements ServletContextListener{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RedisTemplate redisTemplate;
	public void contextInitialized(ServletContextEvent sce) {
		/*final ListOperations listOperations = redisTemplate.opsForList();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					Object list1_value = listOperations.leftPop("list1");
					logger.info("CommonListener ============= pop list1 value is == " + list1_value);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if("END".equals(list1_value)){
						logger.info("CommonListener ============= end" );
						break;
					}
				}
			}
		}).start();*/
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("CommonListener ============= contextDestroyed");
	}

}
