package com.slt.wechat.redis;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {/*
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Bean
	public RedisMessageListenerContainer messageListenerContainer(RedisConnectionFactory connectionFactory,
            MessageListenerAdapter listenerAdapter){
		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.addMessageListener(listenerAdapter, new PatternTopic(CommonParamConfig.COMMMON_TEST_CHANNEL));
		return container;
	}
	@Bean
	public MessageListenerAdapter messageListenerAdapter(MessageReceiver receiver){
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}
	@Bean
	public RedisTemplate redisTemplate(){
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		return redisTemplate;
	}
*/}
