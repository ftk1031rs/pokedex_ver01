package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface PokedexMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
	Pk_pokedex_mst search(PokedexSearchRequest user);
}
