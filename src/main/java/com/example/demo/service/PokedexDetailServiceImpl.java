package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PokedexDetailForm;
import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.model.PokedexListModel;
import com.example.demo.repository.PokedexMapper;

/**
 * ポケモン図鑑 Service
 */
@Service
public class PokedexDetailServiceImpl implements PokedexDetailService{

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
	public List<PokedexDetailForm> selectById(Integer id) {
	
		//ポケモン図鑑データ抽出（検索条件により）
		List<PokedexDetailForm> pokedexDetail = pokedexMapper.selectById(id);
		return pokedexDetail;
	}
	
}
