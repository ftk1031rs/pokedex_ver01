package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Pk_type_mst;

/**
 * 共通 Service
 */
public interface CommonService {

	/**
	 * ポケモン図鑑データ検索
	 * 
	 * @param 
	 * @return タイプリスト
	 */
	List<Pk_type_mst> getTypeList();

}
