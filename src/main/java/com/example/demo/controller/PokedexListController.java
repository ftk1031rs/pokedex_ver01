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
@RequestMapping("pokedexlist")
public class PokedexListController {

	private String pokedexListpath = "/pokedex/pokedexList";

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
	@GetMapping("/init")
	public String initPokedex(Model model) {	
		// 検索フォームのセット
		PokedexSearchForm pokedexSearchForm = new PokedexSearchForm();
        
		// タイプのリストボックスの値セット
		List<Pk_type_mst> typeList = commonService.getTypeList();
		pokedexSearchForm.setTypeList(typeList);
		
		// 検索フォームのマッピング
		model.addAttribute("pokedexSearchForm", pokedexSearchForm);

        // ポケモン図鑑検索画面の初期表示
		return pokedexListpath;
	}

	/**
	 * ポケモン図鑑の検索
	 * 
	 * @param PokedexSearchForm リクエストデータ
	 * @param model                Model
	 * @return ポケモン図鑑検索画面
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(@ModelAttribute PokedexSearchForm pokedexSearchForm, Model model) {

		// タイプのリストボックスの値セット
		List<Pk_type_mst> typeList = commonService.getTypeList();
		pokedexSearchForm.setTypeList(typeList);

		// 入力済みの検索フォームのマッピング
		model.addAttribute("pokedexSearchForm", pokedexSearchForm);

		// 検索フォームに基づき検索処理を実行し、一覧にデータをセット
		model.addAttribute("pokemonDataList", pokedexService.search(pokedexSearchForm));
		
		// ポケモン図鑑検索画面の初期表示
		return pokedexListpath;
		// return initPokedex(model);
	}

}
