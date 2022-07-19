package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PK_POKEDEX_MST")
public class PokeData {

	@Id
	@Column(name="POKEMON_ID")
//  @GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pokemonId;
	
	/** 名前 */
	@Column(name="POKEMON_JP_NAME")
    private String pokemonJpName;
	
    /** タイプ */
    @Column(name="TYPE_ID")
    private int typeId;

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

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
    
}