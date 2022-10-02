package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
public class UserSearchRequest implements Serializable {

	/**
	 * ユーザーID
	 */
	private String user_id;

	/**
	 * ユーザー名
	 */
	private String user_name;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}