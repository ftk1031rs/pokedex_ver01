package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Pk_region_mst;
import com.example.demo.entity.Pk_type_mst;

/**
 * 共通 Service
 */
public interface CommonService {

	/**
	 * タイプリスト取得
	 * 
	 * @param 
	 * @return タイプリスト
	 */
	List<Pk_type_mst> getTypeList();

	/**
	 * 地方リスト取得
	 * 
	 * @param 
	 * @return 地方リスト
	 */
	List<Pk_region_mst> getRegionList();

}
