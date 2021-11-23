package com.projetosic.projetoapisic.service;

import com.projetosic.projetoapisic.model.Pauta;
import com.projetosic.projetoapisic.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    public List<Pauta> listaPauta(){
        return pautaRepository.findAll();
    }

    public Pauta salvarPauta(Pauta pauta){
        return pautaRepository.save(pauta);
    }

    public Pauta listarPautaId(Integer id){
        return pautaRepository.getById(id);
    }
}
