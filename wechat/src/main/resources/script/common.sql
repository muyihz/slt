 CREATE TABLE `userinfo` (
  `userid` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT '' COMMENT '用户姓名',
  `idtype` int(3) DEFAULT '101' COMMENT '证件类型',
  `idno` varchar(30) DEFAULT '' COMMENT '证件号码',
  `family_addr` varchar(200) DEFAULT '' COMMENT '家庭地址',
  `now_addr` varchar(200) DEFAULT '' COMMENT '现住地 ',
  `email` varchar(30) DEFAULT '' COMMENT '邮箱',
  `mobile` varchar(11) DEFAULT '' COMMENT '手机',
  `tel_phone` varchar(20) DEFAULT '' COMMENT '电话',
  `status` int(2) DEFAULT '0' COMMENT '状态',
  `ctime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `mtime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `user_desc` varchar(200) DEFAULT '' COMMENT '说明',
  PRIMARY KEY (`userid`),
  UNIQUE KEY `id_type_no` (`idtype`,`idno`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;