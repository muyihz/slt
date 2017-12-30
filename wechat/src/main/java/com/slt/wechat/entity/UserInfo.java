package com.slt.wechat.entity;
import java.sql.Timestamp;
public class UserInfo {
	public Long userid;
	public String username;
	public int idtype;
	public String idno;
	public String family_addr;
	public String now_addr;
	public String email;
	public String mobile;
	public String tel_phone;
	public int status;
	public Timestamp ctime;
	public Timestamp mtime;
	public String user_desc;
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(Long userid, String username, int idtype, String idno,
			String family_addr, String now_addr, String email, String mobile,
			String tel_phone, int status, Timestamp ctime, Timestamp mtime,
			String user_desc) {
		super();
		this.userid = userid;
		this.username = username;
		this.idtype = idtype;
		this.idno = idno;
		this.family_addr = family_addr;
		this.now_addr = now_addr;
		this.email = email;
		this.mobile = mobile;
		this.tel_phone = tel_phone;
		this.status = status;
		this.ctime = ctime;
		this.mtime = mtime;
		this.user_desc = user_desc;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdtype() {
		return idtype;
	}
	public void setIdtype(int idtype) {
		this.idtype = idtype;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getFamily_addr() {
		return family_addr;
	}
	public void setFamily_addr(String family_addr) {
		this.family_addr = family_addr;
	}
	public String getNow_addr() {
		return now_addr;
	}
	public void setNow_addr(String now_addr) {
		this.now_addr = now_addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTel_phone() {
		return tel_phone;
	}
	public void setTel_phone(String tel_phone) {
		this.tel_phone = tel_phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Timestamp getCtime() {
		return ctime;
	}
	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	public Timestamp getMtime() {
		return mtime;
	}
	public void setMtime(Timestamp mtime) {
		this.mtime = mtime;
	}
	public String getUser_desc() {
		return user_desc;
	}
	public void setUser_desc(String user_desc) {
		this.user_desc = user_desc;
	}
	
}
