package com.example.crud_api.controller;

import com.example.crud_api.entity.Boxer;
import com.example.crud_api.service.BoxerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoxerController {

    private final BoxerService boxerService;

    public BoxerController(BoxerService boxerService) {
        this.boxerService = boxerService;
    }

    /* ボクサー情報全件表示 */
    @GetMapping("/boxers")
    public List<Boxer> getBoxers() {
        return boxerService.findAll();
    }
}
