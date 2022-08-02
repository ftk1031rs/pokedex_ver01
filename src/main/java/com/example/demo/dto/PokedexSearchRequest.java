package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ポケモン図鑑 検索用リクエストデータ
 */

public class PokedexSearchRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** ポケモンID_FROM */
	private Integer pokemonId_from;
	
	/** ポケモンID_TO */
	private Integer pokemonId_to;

	/** ポケモン日本語名 */
    private String pokemonJpName;

	/** ポケモン英語名 */
    private String pokemonEnName;
    
    /** タイプ */
    private Integer typeId;

    /** 高さ */
    private BigDecimal height;
    
    /** 重さ */
    private BigDecimal weight;

	public Integer getPokemonId_from() {
		return pokemonId_from;
	}

	public void setPokemonId_from(Integer pokemonId_from) {
		this.pokemonId_from = pokemonId_from;
	}

	public Integer getPokemonId_to() {
		return pokemonId_to;
	}

	public void setPokemonId_to(Integer pokemonId_to) {
		this.pokemonId_to = pokemonId_to;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
