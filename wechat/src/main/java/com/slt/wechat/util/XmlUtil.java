package com.slt.wechat.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.slt.wechat.entity.TextMessage;
import com.thoughtworks.xstream.XStream;

public class XmlUtil {
	public static Map<String,String> xml2Map(HttpServletRequest request) throws Exception {
		Map<String,String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		InputStream ins = request.getInputStream();
		Document doc = reader.read(ins);
		Element root = doc.getRootElement();
        List<Element> list = root.elements();
        for (Element e : list) {
            map.put(e.getName(), e.getText());
        }
		return map;
	}
	
	 public static String textMessageToXml(TextMessage textMessage) {
	        XStream xstream = new XStream();
	        xstream.alias("xml", textMessage.getClass());
	        return xstream.toXML(textMessage);

	    }
}
