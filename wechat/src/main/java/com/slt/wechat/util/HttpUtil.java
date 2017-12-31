package com.slt.wechat.util;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpVersion;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;

public class HttpUtil {
	public static Request buildGetRequest(URI uri) throws URISyntaxException {
		Request request = Request.Get(uri).version(HttpVersion.HTTP_1_1);
		return request;
	}
	
	public static Request buildPostRequest(URI uri) throws URISyntaxException {
		Request request = Request.Post(uri).version(HttpVersion.HTTP_1_1);
		return request;
	}
}
