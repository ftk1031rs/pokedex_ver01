package com.example.demo.entity;

import java.math.BigDecimal;

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
	private Integer pokemonId;
	
	/** ポケモンID枝番 */
	@Column(name="POKEMON_ID_BRANCH")
    private Integer pokemonIdBranch;
	
	/** ポケモン日本語名 */
	@Column(name="POKEMON_JP_NAME")
    private String pokemonJpName;
	
	/** ポケモン英語名 */
	@Column(name="POKEMON_EN_NAME")
    private String pokemonEnName;
	
    /** タイプID */
    @Column(name="TYPE_ID")
    private Integer typeId;

    /** 高さ */
    @Column(name="HEIGHT")
    private BigDecimal height;
    
    /** 重さ */
    @Column(name="WEIGHT")
    private BigDecimal weight;

    /** Getter Setter */

	public Integer getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Integer pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Integer getPokemonIdBranch() {
		return pokemonIdBranch;
	}

	public void setPokemonIdBranch(Integer pokemonIdBranch) {
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

}