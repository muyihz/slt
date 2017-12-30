package com.slt.wechat.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
	/**
	 * java obj convvert to json
	 * @param obj
	 * @return
	 */
	public static JSONObject obj2Json(Object obj){
		if(obj == null){
			return null;
		}
		JSONObject json = (JSONObject) JSONObject.toJSON(obj);
		return json;
	}
	/**
	 * java obj convvert to JSONArray
	 * @param obj
	 * @return
	 */
	public static JSONArray obj2JsonArray(Object obj){
		if(obj == null){
			return null;
		}
		JSONArray json = (JSONArray) JSONObject.toJSON(obj);
		return json;
	}
}
