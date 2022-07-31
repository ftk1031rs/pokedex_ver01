package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;

public interface PokedexService {

	List<PokedexListModel> search(PokedexSearchRequest pokedexSearchRequest);

}
