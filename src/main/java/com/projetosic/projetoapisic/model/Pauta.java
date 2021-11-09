package com.projetosic.projetoapisic.model;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name="pauta")

public class Pauta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    private int Id;

    @Column(name="Nome")
    private String Nome;
}
