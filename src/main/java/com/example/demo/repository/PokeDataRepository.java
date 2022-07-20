package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PokeData;

@Repository
public interface PokeDataRepository extends JpaRepository<PokeData, Long>{

}
