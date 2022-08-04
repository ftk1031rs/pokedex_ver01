package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;
import com.example.demo.model.TypeModel;

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
	List<TypeModel> getTypeList();

}
