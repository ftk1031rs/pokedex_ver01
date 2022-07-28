package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;
import com.example.demo.repository.PokeDataRepository;
import com.example.demo.service.PokedexService;

/**
 * ポケモン図鑑 Controller
 */
@Controller
@RequestMapping("pokedexlist")
public class PokedexListController {

	private String pokedexListpath = "/pokedex/pokedexList";
	
	/**
	 * ポケモン図鑑検索 Service
	 */
	@Autowired
	PokedexService pokedexService;
	



	  /**
	   * ポケモン図鑑検索画面を表示
	   * @param model Model
	   * @return ポケモン図鑑検索画面
	   */
	  @GetMapping("/init")
	  public String initPokedex(Model model) {
		model.addAttribute("pokedexSearchRequest", new PokedexSearchRequest());
	    return pokedexListpath;
	  }

	  
	  /**
	   * ポケモン図鑑の検索
	   * @param PokedexSearchRequest リクエストデータ
	   * @param model Model
	   * @return ポケモン図鑑検索画面
	   */
	  @RequestMapping(value = "/search", method = RequestMethod.POST)
	  public String search(@ModelAttribute PokedexSearchRequest pokedexSearchRequest, Model model) {
		model.addAttribute("pokedexSearchRequest", pokedexSearchRequest);
	    model.addAttribute("pokemonDataList",pokedexService.search(pokedexSearchRequest));
	    return pokedexListpath;
	  }


}
