package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PokedexDetailForm;
import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.model.PokedexListModel;

/**
 * ポケモン図鑑 Service
 */
public interface PokedexDetailService {

	/**
	 * ポケモン図鑑データ検索
	 * 
	 * @param pokedexSearchForm PokedexSearchForm
	 * @return ポケモン図鑑リスト
	 */
	List<PokedexDetailForm> selectById(Integer id);

	/**
	 * ポケモンデータ更新
	 * 
	 * @param PokedexDetailForm pokedexDetailForm
	 * @return 
	 */
	void pokemonDataUpdate(PokedexDetailForm pokedexDetailForm);

}
