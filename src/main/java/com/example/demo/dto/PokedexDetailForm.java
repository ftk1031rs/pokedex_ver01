package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.example.demo.entity.Pk_type_mst;
import com.example.demo.model.PokedexListModel;

/**
 * ポケモン図鑑 検索用リクエストデータ
 */

public class PokedexDetailForm extends PokedexListModel {
    /** タイプリスト */
    private List<Pk_type_mst> typeList;

	public List<Pk_type_mst> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Pk_type_mst> typeList) {
		this.typeList = typeList;
	}
    
}
