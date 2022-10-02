package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.demo.entity.Pk_region_mst;

import lombok.Data;

/**
 * ユーザー情報登録 リクエストデータ
 */
@Data
public class UserAddRequest implements Serializable {
	/**
	 * ID
	 */
	private String user_id;
	/**
	 * 名前
	 */
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 100, message = "名前は100桁以内で入力してください")
	private String user_name;

	
	/**
	 * 地方リスト
	 */
	private List<Pk_region_mst> regionList;

	/**
	 * 住所
	 */
	@Size(max = 255, message = "住所は255桁以内で入力してください")
	private String user_address;
	/**
	 * 電話番号
	 */
	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
	private String phone;

	
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
	public List<Pk_region_mst> getRegionList() {
		return regionList;
	}
	public void setRegionList(List<Pk_region_mst> regionList) {
		this.regionList = regionList;
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

}