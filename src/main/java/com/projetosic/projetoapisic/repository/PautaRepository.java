package com.projetosic.projetoapisic.repository;

import com.projetosic.projetoapisic.model.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pauta", path = "pauta")
public interface PautaRepository extends JpaRepository<Pauta, Integer> {

}
