package com.projetosic.projetoapisic.controller;

import com.projetosic.projetoapisic.model.Pauta;
import com.projetosic.projetoapisic.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/criarPauta")
    public Pauta criarPauta(@RequestBody Pauta pauta){
        return pautaService.salvarPauta(pauta);
    }

    @GetMapping("/listaPauta/{id}")
    public Pauta listaPautaId(@PathVariable Integer id){
        return pautaService.listarPautaId(id);
    }

}
