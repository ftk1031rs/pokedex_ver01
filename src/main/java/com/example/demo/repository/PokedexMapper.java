package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface PokedexMapper {
    /**
     * ポケモン図鑑検索
     * @param pokedexSearchRequest 検索用リクエストデータ
     * @return ポケモン図鑑リスト
     */
	
	List<PokedexListModel> selectAll();
	//List<PokedexListModel> search(PokedexSearchRequest pokedexSearchRequest);
	//Pk_pokedex_mst search(PokedexSearchRequest pokedexSearchRequest);
}
