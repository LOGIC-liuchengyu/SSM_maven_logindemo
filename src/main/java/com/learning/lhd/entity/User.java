package com.learning.lhd.entity;

import java.util.Date;

   /**
    *�û�ʵ��
    */
public class User {
	
	
	int      id;  //id
	
	String   username;  //�û�����
	
	String   password;   //�û�����
	
	int      sex;      //�Ա�
	
	String    address;  //��ַ
	
	Date    birthday;   //����
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

}
