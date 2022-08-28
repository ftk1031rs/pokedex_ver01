package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.entity.Pk_type_mst;
import com.example.demo.service.CommonService;
import com.example.demo.service.PokedexService;

/**
 * ポケモン図鑑 Controller
 */
@Controller
public class ToppageController {

	private String toppagepath = "/toppage/toppage";

	/**
	 * 共通 Service
	 */
	@Autowired
	CommonService commonService;
	
	/**
	 * ポケモン図鑑検索 Service
	 */
	@Autowired
	PokedexService pokedexService;

	/**
	 * ポケモン図鑑検索画面を表示
	 * 
	 * @param model Model
	 * @return ポケモン図鑑検索画面
	 */
	@GetMapping("/pokemontoppage")
	public String initPokedex(Model model) {
        // ポケモン図鑑検索画面の初期表示
		return toppagepath;
	}

	/**
	 * ポケモン図鑑の検索
	 * 
	 * @param PokedexSearchForm リクエストデータ
	 * @param model                Model
	 * @return ポケモン図鑑検索画面
	 */
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String search(@ModelAttribute PokedexSearchForm pokedexSearchForm, Model model) {		
//		// ポケモン図鑑検索画面の初期表示
//		return toppagepath;
//	}

}
