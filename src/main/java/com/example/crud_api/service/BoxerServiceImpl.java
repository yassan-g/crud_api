package com.example.crud_api.service;

import com.example.crud_api.entity.Boxer;
import com.example.crud_api.repository.BoxerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxerServiceImpl implements BoxerService{

    private final BoxerMapper boxerMapper;

    public BoxerServiceImpl(BoxerMapper boxerMapper) {
        this.boxerMapper = boxerMapper;
    }

    @Override
    public List<Boxer> findAll() {
        return boxerMapper.findAll();
    }
}
