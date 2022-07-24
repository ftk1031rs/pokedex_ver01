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
import com.example.demo.repository.PokeDataRepository;
import com.example.demo.service.PokedexService;

/**
 * ポケモン図鑑 Controller
 */
@Controller
@RequestMapping("pokedexlist")
public class PokedexListController {
	/**
	 * ポケモン図鑑検索 Service
	 */
	//@Autowired
	//PokedexService userService;
	
	// 後で消す
    @Autowired
    private PokeDataRepository repository;


	  /**
	   * ポケモン図鑑検索画面を表示
	   * @param model Model
	   * @return ポケモン図鑑検索画面
	   */
	  @GetMapping("/init")
	  public String initPokedex(Model model) {
		model.addAttribute("pokedexSearchRequest", new PokedexSearchRequest());
	    return "/pokedex/pokedexList";
	  }

	  
	  /**
	   * ポケモン図鑑の検索
	   * @param PokedexSearchRequest リクエストデータ
	   * @param model Model
	   * @return ポケモン図鑑検索画面
	   */
	  @RequestMapping(value = "/search", method = RequestMethod.POST)
	  public String search(@ModelAttribute PokedexSearchRequest pokedexSearchRequest, Model model) {
	    
	    //これは後で消す
	    List<Pk_pokedex_mst> pokemonDataList = repository.findAll();
	    model.addAttribute("pokemonDataList",pokemonDataList);
	    	    
//		User user = userService.search(userSearchRequest);
//	    model.addAttribute("userinfo", user);
	    return "/pokedex/pokedexList";
	  }


}
