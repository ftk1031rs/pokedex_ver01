package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.model.PokedexListModel;

/**
 * ポケモン図鑑 Service
 */
public interface PokedexService {

	/**
	 * ポケモン図鑑データ検索
	 * 
	 * @param pokedexSearchForm PokedexSearchForm
	 * @return ポケモン図鑑リスト
	 */
	List<PokedexListModel> search(PokedexSearchForm pokedexSearchForm);

}
