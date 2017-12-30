package com.slt.wechat.redis;

import java.util.concurrent.ExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MessageReceiver {/*
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ExecutorService executorService ;
	public void receiveMessage(final String message){
		logger.info("接收消息  ===== " + message);
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				try {
					logger.info("处理中  ===== " + message);
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				logger.info("处理完毕  ===== " + message);
			}
		});
		
	}
*/}
