package com.projetosic.projetoapisic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createPauta")
public class PautaController {

    @GetMapping
    public String createPauta(){
        return "aqui é uma rest";
    }
}
