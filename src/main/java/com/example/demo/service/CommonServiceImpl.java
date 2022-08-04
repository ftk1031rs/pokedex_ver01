package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.model.PokedexListModel;
import com.example.demo.model.TypeModel;
import com.example.demo.repository.CommonMapper;
import com.example.demo.repository.PokedexMapper;

/**
 * 共通 Service
 */
@Service
public class CommonServiceImpl implements CommonService{
	/**
	 * 共通 Mapper
	 */
    @Autowired
    private CommonMapper commonMapper;

	/**
	 * タイプリスト取得
	 * 
	 * @param 
	 * @return タイプリスト
	 */
	@Override
	public List<TypeModel> getTypeList(){
		//タイプリスト取得
		List<TypeModel> typeList = commonMapper.selectTypeList();
		return typeList;
	}
	
}
