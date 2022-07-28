package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PokedexSearchRequest;
import com.example.demo.entity.Pk_pokedex_mst;
import com.example.demo.model.PokedexListModel;
import com.example.demo.repository.PokeDataRepository;
//import com.example.demo.repository.PokedexListDao;
import com.example.demo.repository.PokedexMapper;

@Service
public class PokedexServiceImpl implements PokedexService{
    /**
     * ポケモン図鑑 Service
     */
    @Autowired
    private PokedexMapper pokedexMapper;
    //private PokedexListDao pokedexListDao;
    //private PokeDataRepository pokerepository;

    
	@Override
	public List<PokedexListModel> search(PokedexSearchRequest pokedexSearchRequest) {
		//List<PokedexListModel> pokedexList = repository.findAll();
		//List<PokedexListModel> pokedexFormList = new ArrayList<>();

		//Collection<PokedexListModel> pokedexList = pokedexListDao.findAll();
		//List<PokedexListModel> pokedexList = pokedexListDao.findAll();
    	
		
		//List<PokedexListModel> pokedexList = pokedexMapper.search(pokedexSearchRequest);
		List<PokedexListModel> pokedexList = pokedexMapper.selectAll();
		
		
//        for (PokedexListModel pokedexData : pokedexList) {
//        	pokedexFormList.add(getDemoForm(pokedexData));
//        }
//        return demoFormList;
		
		return pokedexList;
	}
	
//    private PokedexListModel getDemoForm(UserData userData){
//        if(userData == null){
//            return null;
//        }
//        DemoForm demoForm = new DemoForm();
//        demoForm.setId(String.valueOf(userData.getId()));
//        demoForm.setName(userData.getName());
//        demoForm.setBirthYear(String.valueOf(userData.getBirthY()));
//        demoForm.setBirthMonth(String.valueOf(userData.getBirthM()));
//        demoForm.setBirthDay(String.valueOf(userData.getBirthD()));
//        demoForm.setSex(userData.getSex());
//        demoForm.setSex_value("1".equals(userData.getSex()) ? "男" : "女");
//        return demoForm;
//    }
	
}
