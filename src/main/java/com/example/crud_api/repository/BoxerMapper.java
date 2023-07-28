package com.example.crud_api.repository;

import com.example.crud_api.entity.Boxer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoxerMapper {

    /* ボクサー情報全件検索 */
    @Select("SELECT * FROM boxers")
    List<Boxer> findAll();
}
