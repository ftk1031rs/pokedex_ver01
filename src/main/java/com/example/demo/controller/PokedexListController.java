package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.PokedexDetailForm;
import com.example.demo.dto.PokedexSearchForm;
import com.example.demo.entity.Pk_type_mst;
import com.example.demo.service.CommonService;
import com.example.demo.service.PokedexDetailService;
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
	 * ポケモン図鑑更新 Service
	 */
	@Autowired
	PokedexDetailService pokedexDetailService;

	/**
	 * ポケモン図鑑検索画面を表示
	 * 
	 * @param model Model
	 * @return ポケモン図鑑検索画面
	 */
	@RequestMapping(value = "/init", method = RequestMethod.POST)
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
	 * @param model Model
	 * @return ポケモン図鑑検索画面
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(@ModelAttribute PokedexSearchForm pokedexSearchForm, Model model) {

		// タイプのリストボックスの値セット
		List<Pk_type_mst> typeList = commonService.getTypeList();
		pokedexSearchForm.setTypeList(typeList);

		// 入力済みの検索フォームのマッピング
		model.addAttribute("pokedexSearchForm", pokedexSearchForm);
		// TODO 一つ一つの項目に値をセットしておくこと　→　共通の関数を作っておくこと
		model.addAttribute("pokemonJpName", pokedexSearchForm.getPokemonJpName());

		// 検索フォームに基づき検索処理を実行し、一覧にデータをセット
		model.addAttribute("pokemonDataList", pokedexService.search(pokedexSearchForm));
		
		// ポケモン図鑑検索画面の初期表示
		return pokedexListpath;
		// return initPokedex(model);
	}
	
	/**
	 * ポケモン図鑑の詳細
	 * 
	 * @param PokedexSearchForm リクエストデータ
	 * @param model Model
	 * @return ポケモン図鑑検索画面
	 */
	@GetMapping("/{id}")
	public String dispDetail(@PathVariable Integer id, Model model) {
		// フォームのセット
		PokedexDetailForm pokedexDetailForm = new PokedexDetailForm();
		pokedexDetailForm = pokedexDetailService.selectById(id).get(0);
		
		// タイプのリストボックスの値セット
		List<Pk_type_mst> typeList = commonService.getTypeList();
		pokedexDetailForm.setTypeList(typeList);
		
		// 検索フォームのマッピング
		model.addAttribute("pokedexDetailForm", pokedexDetailForm);
	    return "/pokedex/pokedexDetail";
	}
	
	/**
	 * ポケモン図鑑の検索
	 * 
	 * @param PokedexSearchForm リクエストデータ
	 * @param model Model
	 * @return ポケモン図鑑検索画面
	 */
	@PostMapping("/update")
	public String update(@ModelAttribute PokedexDetailForm pokedexDetailForm, Model model) {
		System.out.println(pokedexDetailForm.getTypeId());
		// タイプのリストボックスの値セット
		List<Pk_type_mst> typeList = commonService.getTypeList();
		pokedexDetailForm.setTypeList(typeList);
		
		model.addAttribute("typeId", pokedexDetailForm.getTypeId());
	    
		return "/pokedex/pokedexDetail";
	}
	
	
	/**
	 * ポケモン図鑑の検索
	 * 
	 * @param PokedexSearchForm リクエストデータ
	 * @param model Model
	 * @return ポケモン図鑑検索画面
	 */
	@PostMapping("/delete")
	public String delete(@RequestParam int id, Model model) {
	    //int count = diaryservice.delete(id);
	    return "redirect:/diary";
	}

}
