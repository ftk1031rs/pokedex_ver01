package com.example.demo.model;

import javax.persistence.Column;
import com.example.demo.entity.Pk_pokedex_mst;

/**
 * ポケモン図鑑一覧のデータModel
 */
public class PokedexListModel extends Pk_pokedex_mst{

	/** タイプ */
	@Column(name="TYPE_NAME")
    private String typeName;

    /** Getter Setter */
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}