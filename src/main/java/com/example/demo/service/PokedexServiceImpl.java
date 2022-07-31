package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.model.PokedexListModel;
import com.example.demo.repository.PokedexMapper;

@Service
public class PokedexServiceImpl implements PokedexService{
    /**
     * ポケモン図鑑 Service
     */
    @Autowired
    private PokedexMapper pokedexMapper;
    
	@Override
	public List<PokedexListModel> search(PokedexSearchRequest pokedexSearchRequest) {
		//ポケモン図鑑データ全件抽出
		//List<PokedexListModel> pokedexList = pokedexMapper.selectAll();
		
		//ポケモン図鑑データ抽出（検索条件により）
		List<PokedexListModel> pokedexList = pokedexMapper.selectBySearchConditions(pokedexSearchRequest);
		return pokedexList;
	}
	
}
