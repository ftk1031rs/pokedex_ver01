package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.PokedexDetailForm;
import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;

/**
 * ポケモン図鑑 Mapper
 */
@Mapper
public interface PokedexMapper {
	// ポケモン図鑑データ全件抽出
	// List<PokedexListModel> selectAll();

    /**
     * ポケモン図鑑検索
     * @param pokedexSearchRequest 検索用リクエストデータ
     * @return ポケモン図鑑リスト
     */
	List<PokedexListModel> selectBySearchConditions(PokedexSearchForm pokedexSearchForm);

    /**
     * ポケモン図鑑検索
     * @param pokedexSearchRequest 検索用リクエストデータ
     * @return ポケモン図鑑リスト
     */
	List<PokedexDetailForm> selectById(Integer id);
	
    /**
     * ポケモン図鑑更新
     * @param pokedexSearchRequest 検索用リクエストデータ
     * @return ポケモン図鑑リスト
     */
	void update(Pk_pokedex_mst pk_pokedex_mst);
	
}
