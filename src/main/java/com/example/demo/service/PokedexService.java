package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;

/**
 * ポケモン図鑑 Service
 */
public interface PokedexService {

	/**
	 * ポケモン図鑑データ検索
	 * 
	 * @param pokedexSearchRequest PokedexSearchRequest
	 * @return ポケモン図鑑リスト
	 */
	List<PokedexListModel> search(PokedexSearchRequest pokedexSearchRequest);

}
