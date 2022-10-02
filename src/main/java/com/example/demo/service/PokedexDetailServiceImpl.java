package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PokedexDetailForm;
import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.entity.Pk_pokedex_mst;
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

	/**
	 * ポケモンデータ更新
	 * 
	 * @param PokedexDetailForm pokedexDetailForm
	 * @return 
	 */
	@Override
	public void pokemonDataUpdate(PokedexDetailForm pokedexDetailForm) {
		Pk_pokedex_mst pk_pokedex_mst = new Pk_pokedex_mst();
		pk_pokedex_mst.setPokemonId(pokedexDetailForm.getPokemonId());
		pk_pokedex_mst.setPokemonJpName(pokedexDetailForm.getPokemonJpName());
		pk_pokedex_mst.setPokemonEnName(pokedexDetailForm.getPokemonEnName());
		pk_pokedex_mst.setTypeId(pokedexDetailForm.getTypeId());
		pk_pokedex_mst.setHeight(pokedexDetailForm.getHeight());
		pk_pokedex_mst.setWeight(pokedexDetailForm.getWeight());
		// Whoカラムの更新はあとで
		pokedexMapper.update(pk_pokedex_mst);
	}
	
}
