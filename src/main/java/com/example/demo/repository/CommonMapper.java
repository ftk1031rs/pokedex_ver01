package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Pk_region_mst;
import com.example.demo.entity.Pk_type_mst;

/**
 * 共通 Mapper
 */
@Mapper
public interface CommonMapper {

    /**
     * タイプリスト取得
     * @param 
     * @return タイプリスト
     */
	List<Pk_type_mst> selectTypeList();

    /**
     * 地方リスト取得
     * @param 
     * @return 地方リスト
     */
	List<Pk_region_mst> selectRegionList();
}
