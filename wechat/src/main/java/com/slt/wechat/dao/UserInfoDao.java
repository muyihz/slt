package com.slt.wechat.dao;
import org.mybatis.spring.annotation.MapperScan;

import com.slt.wechat.entity.UserInfo;
@MapperScan
public interface UserInfoDao {
	public UserInfo getUserInfo(Long userid);
}
