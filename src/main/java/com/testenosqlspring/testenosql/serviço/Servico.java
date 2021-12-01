package com.testenosqlspring.testenosql.serviço;

import com.testenosqlspring.testenosql.model.Livro;

import java.util.List;

public interface Servico {
    public List<Livro> findAll();
    public void save(Livro livro);
}
