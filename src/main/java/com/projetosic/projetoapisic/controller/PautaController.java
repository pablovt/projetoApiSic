package com.projetosic.projetoapisic.controller;

import com.projetosic.projetoapisic.model.Pauta;
import com.projetosic.projetoapisic.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(method = RequestMethod.POST, path="/pauta")
public class PautaController {

    @Autowired
    private PautaService pautaService;

    @GetMapping("/listaPauta")
    public List<Pauta> listaPauta(){
        return pautaService.listaPauta();
    }
}
