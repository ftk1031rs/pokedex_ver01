package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;
import com.example.demo.model.TypeModel;

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
	List<TypeModel> selectTypeList();

}
