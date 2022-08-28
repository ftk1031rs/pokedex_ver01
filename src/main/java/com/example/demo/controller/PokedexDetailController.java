package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.PokedexDetailForm;
import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.entity.Pk_type_mst;
import com.example.demo.model.PokedexListModel;
import com.example.demo.service.CommonService;
import com.example.demo.service.PokedexDetailService;
import com.example.demo.service.PokedexService;

/**
 * ポケモン図鑑 Controller
 */
@Controller
@RequestMapping("pokedexdetail")
public class PokedexDetailController {

	
	// TODO ここのパスも修正
	private String pokedexDetailpath = "/pokedex/pokedexDetail";

	/**
	 * 共通 Service
	 */
	@Autowired
	CommonService commonService;

	/**
	 * ポケモン図鑑検索 Service
	 */
	@Autowired
	PokedexDetailService pokedexDetailService;

	/**
	 * ユーザー情報詳細画面を表示
	 * 
	 * @param id    表示するユーザーID
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@GetMapping("/{id}")
	public String dispDetail(@PathVariable Integer id, Model model) {
		// ポケモンIDを基にデータを取得
		PokedexDetailForm pokedexDetailForm = pokedexDetailService.selectById(id).get(0);

		// タイプのリストボックスの値セット
		pokedexDetailForm.setTypeList(commonService.getTypeList());
		
		// TODO その３：各項目のマッピングをする
		model.addAttribute("pokemonId", pokedexDetailForm.getPokemonId());
		model.addAttribute("pokemonJpName", pokedexDetailForm.getPokemonJpName());
		model.addAttribute("pokemonEnName", pokedexDetailForm.getPokemonEnName());
		model.addAttribute("typeId", pokedexDetailForm.getTypeId());
		model.addAttribute("height", pokedexDetailForm.getHeight());
		model.addAttribute("weight", pokedexDetailForm.getWeight());
		return pokedexDetailpath;
	}

}
