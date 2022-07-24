package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.repository.PokeDataRepository;
import com.example.demo.service.PokedexService;

/**
 * ポケモン図鑑 Controller
 */

@Controller
public class MainController {
	
    /**
     * POKEDEX_TBLへアクセスするリポジトリ
     */
    @Autowired
    private PokeDataRepository repository;


	@GetMapping("/test1")
	public String write1(Model model) {
		model.addAttribute("moji", "hello world!");
		
		
		List<Pk_pokedex_mst> pokemonDataList = repository.findAll();
		//model.addAttribute("pokemonDataList",pokemonDataList);
		
		model.addAttribute("pokemonDataList",pokemonDataList);
		return "hello";
	}
}