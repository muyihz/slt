package com.slt.wechat.util;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.slt.wechat.entity.Button;
import com.slt.wechat.entity.Menu;

public class WeChatUtil {
	//微信接口开发
	public static final String WECHAT_APPID = "wxa621dd22e8529f38";
	public static final String WECHAT_APPSECRET = "2b2d7de86c75c332dfa1932711716b60";
	public static final String WECHAT_ENCODINGAESKEY = "YksSdPMy5mz4NYGxkw9dTeguobKQRtinYUhI3fKADDS";
	public static String WECHAT_ACCESS_TOKEN = "5_Gu7GlrtjahwFsjefEOcIWIodkhbQXv0-OhXJfD7ZnoLxGcfuOTWnIWOc-vNfBJCj1Iy0DV66jsuXr91uJkOVfZVscOb_HyDbtBd8HcS_chWQLc1lijR-CLpwx6SC055CRFEYaGqsGnPMsYFEUIUbAHADRD";
	public static final String WECHAT_DEV_URL="https://api.weixin.qq.com";
	
	//public static final String WECHAT_CREATEMUEN_URL=" https://api.weixin.qq.com/cgi-bin/menu/create";
	
	public static String getAccessToken() throws Exception {
		
		List<NameValuePair> formParams = new ArrayList<NameValuePair>();
		formParams.add(new BasicNameValuePair("grant_type","client_credential"));
		formParams.add(new BasicNameValuePair("appid",WECHAT_APPID));
		formParams.add(new BasicNameValuePair("secret",WECHAT_APPSECRET));
		URI uri = new URIBuilder(WECHAT_DEV_URL).setPath("/cgi-bin/token").addParameters(formParams).build();
		Response response = HttpUtil.buildGetRequest(uri).execute();
		HttpResponse httpResponse = response.returnResponse();
		String retStr = EntityUtils.toString(httpResponse.getEntity(),Consts.UTF_8);
		JSONObject retJson = (JSONObject) JSONObject.parse(retStr);
		String accessToken = retJson == null ?null:retJson.getString("access_token");
		WECHAT_ACCESS_TOKEN = accessToken;
		return accessToken;
	}
	
	public static void createMenu() throws Exception {
		
		List<NameValuePair> formParams = new ArrayList<NameValuePair>();
		formParams.add(new BasicNameValuePair("access_token",WECHAT_ACCESS_TOKEN));
		URI uri = new URIBuilder(WECHAT_DEV_URL).setPath("/cgi-bin/menu/create").addParameters(formParams).build();
		UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams);
		Request request = HttpUtil.buildPostRequest(uri).body(entity);
		//菜单
		Button[] bts = {new Button("企鹅易购", "view", "shop_btn", "http://121.42.147.37:8080/html/index.html", null),new Button("个人中心", "view", "self_btn", "http://121.42.147.37:8080/html/index.html", null),new Button("我的卡券", "view", "card_btn", "http://121.42.147.37:8080/html/index.html", null)};
		Menu menu = new Menu(bts);
		String menuStr = JsonUtil.obj2Json(menu).toJSONString();
		request.bodyByteArray(menuStr.getBytes("UTF-8"));
		Response response = request.execute();
		HttpResponse httpResponse = response.returnResponse();
		String retStr = EntityUtils.toString(httpResponse.getEntity(),Consts.UTF_8);
		JSONObject retJson = (JSONObject) JSONObject.parse(retStr);
		System.out.println(retJson);
		
	}
	
	public static void main(String[] args) throws Exception {
		//String ss = getAccessToken();
		//System.out.println(ss);
		createMenu();
	}
}
