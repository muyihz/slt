package com.slt.wechat.util;

import java.util.UUID;

public class SessionCreateUtil {
	
	public static String createSessionId(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	public static void main(String[] args) {
		System.out.println(createSessionId());
	}
}
