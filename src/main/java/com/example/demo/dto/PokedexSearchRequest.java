package com.example.demo.dto;

import java.io.Serializable;

/**
 * ポケモン図鑑 検索用リクエストデータ
 */

public class PokedexSearchRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** ポケモンID */
	private int pokemonId;

	/** ポケモン日本語名 */
    private String pokemonJpName;

	/** ポケモン英語名 */
    private String pokemonEnName;
    
    /** タイプ */
    private int typeId;

    /** 高さ */
    private double height;
    
    /** 重さ */
    private double weight;

	public int getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(int pokemonId) {
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

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
