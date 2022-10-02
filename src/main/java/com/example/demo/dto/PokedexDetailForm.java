package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.example.demo.entity.Pk_type_mst;
import com.example.demo.entity.WhoColumns;
import com.example.demo.model.PokedexListModel;

/**
 * ポケモン図鑑詳細 更新用リクエストデータ
 */

//public class PokedexDetailForm extends PokedexListModel {
//	
//    /** タイプリスト */
//    private List<Pk_type_mst> typeList;
//
//	public List<Pk_type_mst> getTypeList() {
//		return typeList;
//	}
//
//	public void setTypeList(List<Pk_type_mst> typeList) {
//		this.typeList = typeList;
//	}
//    
//}

public class PokedexDetailForm extends WhoColumns{
	/** ポケモンID */
	private Integer pokemonId;

	/** ポケモン日本語名 */
    private String pokemonJpName;

	/** ポケモン英語名 */
    private String pokemonEnName;
    
    /** タイプID */
    private Integer typeId;
    
    /** タイプ名 */
    private String typeName;
    
    /** タイプリスト */
    private List<Pk_type_mst> typeList;

    /** 高さ */
    private BigDecimal height;
    
    /** 重さ */
    private BigDecimal weight;

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getPokemonJpName() {
		return pokemonJpName;
	}

	public void setPokemonJpName(String pokemonJpName) {
		this.pokemonJpName = pokemonJpName;
	}

	public String getPokemonEnName() {
		return pokemonEnName;
	}

	public void setPokemonEnName(String pokemonEnName) {
		this.pokemonEnName = pokemonEnName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public List<Pk_type_mst> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Pk_type_mst> typeList) {
		this.typeList = typeList;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}
