package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
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

	private String pokedexDetailpath = "/pokedex/pokedexDetail";

	/**
	 * 共通 Service
	 */
	@Autowired
	CommonService commonService;

	/**
	 * ポケモン図鑑更新 Service
	 */
	@Autowired
	PokedexDetailService pokedexDetailService;

	/**
	 * ポケモン詳細画面を表示
	 * 
	 * @param id    表示するポケモンID
	 * @param model Model
	 * @return ポケモン詳細画面
	 */
	@GetMapping("/{id}")
	public String dispDetail(@PathVariable Integer id, Model model) {
		// ポケモンIDを基にデータを取得
		// PokedexDetailForm pokedexDetailForm = pokedexDetailService.selectById(id).get(0);
		PokedexDetailForm pokedexDetailForm = new PokedexDetailForm();
		pokedexDetailForm = pokedexDetailService.selectById(id).get(0);
		

		// タイプのリストボックスの値セット
        // model.addAttribute("typeList", commonService.getTypeList());
		List<Pk_type_mst> typeList = commonService.getTypeList();
		pokedexDetailForm.setTypeList(typeList);
		
		// 各項目のマッピングをする
		// model.addAttribute("pokemonId", pokedexDetailForm.getPokemonId());
		// model.addAttribute("pokemonJpName", pokedexDetailForm.getPokemonJpName());
		// model.addAttribute("pokemonEnName", pokedexDetailForm.getPokemonEnName());
		// model.addAttribute("selectedtypeId", pokedexDetailForm.getTypeId()); // タイプリストの初期値がうまくセットされない
		// model.addAttribute("height", pokedexDetailForm.getHeight());
		// model.addAttribute("weight", pokedexDetailForm.getWeight());
		
		// 詳細フォームのマッピング
		model.addAttribute("pokedexDetailForm", pokedexDetailForm);
		return pokedexDetailpath;
	}
	
	/**
	 * ポケモン図鑑の更新
	 * 
	 * @param PokedexSearchForm リクエストデータ
	 * @param model Model
	 * @return ポケモン図鑑更新画面
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
//  public String update(@Validated @ModelAttribute PokedexDetailForm pokedexDetailForm, BindingResult result , Model model) {
	public String update(@ModelAttribute PokedexDetailForm pokedexDetailForm, Model model) {
//		if (result.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//			model.addAttribute("validationError", errorList);
//			return pokedexDetailpath;
//		}
		
//		// ポケモンIDを基に更新対象のデータを検索　※あとで共通処理（排他制御も忘れずに）にする
//		if(pokedexDetailService.selectById(pokedexDetailForm.getPokemonId()).get(0) != null){
//			// 更新対象のデータが存在する場合更新処理
//			pokedexDetailService.pokemonDataUpdate(pokedexDetailForm);	
//		}else {
//			model.addAttribute("validationError", "更新対象のデータがないよ");
//		}
		
		// 更新処理
		pokedexDetailService.pokemonDataUpdate(pokedexDetailForm);
		
		// return String.format("redirect:/user/%d", userUpdateRequest.getId());
		return pokedexDetailpath;
	}
}
