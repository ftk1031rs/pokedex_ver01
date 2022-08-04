package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.model.PokedexListModel;
import com.example.demo.repository.PokedexMapper;

/**
 * ポケモン図鑑 Service
 */
@Service
public class PokedexServiceImpl implements PokedexService{

	/**
	 * ポケモン図鑑Mapper
	 */
    @Autowired
    private PokedexMapper pokedexMapper;

	/**
	 * ポケモン図鑑データ検索
	 * 
	 * @param pokedexSearchRequest PokedexSearchRequest
	 * @return ポケモン図鑑リスト
	 */
	@Override
	public List<PokedexListModel> search(PokedexSearchRequest pokedexSearchRequest) {
	
		//ポケモン図鑑データ抽出（検索条件により）
		List<PokedexListModel> pokedexList = pokedexMapper.selectBySearchConditions(pokedexSearchRequest);
		return pokedexList;
	}
	
}
