package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pk_region_mst;
import com.example.demo.entity.Pk_type_mst;
import com.example.demo.repository.CommonMapper;

/**
 * 共通 Service
 */
@Service
public class CommonServiceImpl implements CommonService{
	/**
	 * 共通 Mapper
	 */
    @Autowired
    private CommonMapper commonMapper;

	/**
	 * タイプリスト取得
	 * 
	 * @param 
	 * @return タイプリスト
	 */
	@Override
	public List<Pk_type_mst> getTypeList(){
		//タイプリスト取得
		List<Pk_type_mst> typeList = commonMapper.selectTypeList();
		return typeList;
	}
	
	/**
	 * 地方リスト取得
	 * 
	 * @param 
	 * @return 地方リスト
	 */
	@Override
	public List<Pk_region_mst> getRegionList(){
		//タイプリスト取得
		List<Pk_region_mst> regionList = commonMapper.selectRegionList();
		return regionList;
	}
	
	
}
