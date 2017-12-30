package com.test.wechat;

import com.slt.wechat.entity.Button;
import com.slt.wechat.entity.Menu;
import com.slt.wechat.entity.SubButton;
import com.slt.wechat.util.JsonUtil;

public class Test {
	public static void main(String[] args) {
		SubButton[] sbts = {new SubButton("子菜单1", "click", "sbu1", null),new SubButton("子菜单2", "view", "sbu1", "http://127.0.0.1")} ;
		Button[] bts = {new Button("菜单1", null, "bt1", null, sbts),new Button("菜单2", "view", "bt2", "http://127.0.0.1", null)};
		Menu menu = new Menu(bts);
		String str = JsonUtil.obj2Json(menu).toJSONString();
		System.out.println(str);
	}
	
	
}
