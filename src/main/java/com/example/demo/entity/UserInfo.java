package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
public class UserInfo implements Serializable {

	/**
	 * ID
	 */
	private String user_id;

	/**
	 * 名前
	 */
	private String user_name;

	/**
	 * 住所
	 */
	private String user_address;

	/**
	 * 電話番号
	 */
	private String phone;

	/**
	 * 更新日時
	 */
	private Date updateDate;

	/**
	 * 登録日時
	 */
	private Date createDate;

	/**
	 * 削除日時
	 */
	private Date deleteDate;

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

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	
}