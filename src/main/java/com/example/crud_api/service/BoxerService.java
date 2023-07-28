package com.example.crud_api.service;

import com.example.crud_api.entity.Boxer;

import java.util.List;

public interface BoxerService {

    /* ボクサー情報全件検索 */
    List<Boxer> findAll();
}
