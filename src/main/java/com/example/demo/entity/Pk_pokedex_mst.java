package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PK_POKEDEX_MST")
public class Pk_pokedex_mst extends WhoColumns{

	/** ポケモンID */
	@Id
	@Column(name="POKEMON_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pokemonId;
	
	/** ポケモンID枝番 */
	@Column(name="POKEMON_ID_BRANCH")
    private int pokemonIdBranch;
	
	/** ポケモン日本語名 */
	@Column(name="POKEMON_JP_NAME")
    private String pokemonJpName;
	
	/** ポケモン英語名 */
	@Column(name="POKEMON_EN_NAME")
    private String pokemonEnName;
	
    /** タイプID */
    @Column(name="TYPE_ID")
    private int typeId;

    /** 高さ */
    @Column(name="HEIGHT")
    private double height;
    
    /** 重さ */
    @Column(name="WEIGHT")
    private double weight;

    /** Getter Setter */
	public int getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(int pokemonId) {
		this.pokemonId = pokemonId;
	}

	public int getPokemonIdBranch() {
		return pokemonIdBranch;
	}

	public void setPokemonIdBranch(int pokemonIdBranch) {
		this.pokemonIdBranch = pokemonIdBranch;
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