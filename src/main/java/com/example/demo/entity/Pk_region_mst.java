package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ポケモン図鑑検索画面を表示
 * 
 * @param model Model
 * @return ポケモン図鑑検索画面
 */
@Entity
@Table(name="PK_REGION_MST")
public class Pk_region_mst {
	/** 地方ID */
	@Id
	@Column(name="REGION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String region_id;
	
	/** 地方名 */
	@Column(name="REGION_NAME_JP")
    private String region_name_jp;

	public String getRegion_id() {
		return region_id;
	}

	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}

	public String getRegion_name_jp() {
		return region_name_jp;
	}

	public void setRegion_name_jp(String region_name_jp) {
		this.region_name_jp = region_name_jp;
	}

}
