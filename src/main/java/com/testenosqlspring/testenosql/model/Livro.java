package com.testenosqlspring.testenosql.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Livro {
    @Id
    private String codigo;
    private String nome;
    private int paginas;
    private int ano;
}
