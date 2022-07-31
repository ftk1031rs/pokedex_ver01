package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.entity.Pk_pokedex_mst;

import lombok.Data;

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