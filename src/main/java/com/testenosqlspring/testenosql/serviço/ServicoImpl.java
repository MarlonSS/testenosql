package com.testenosqlspring.testenosql.serviço;

import com.testenosqlspring.testenosql.Repositorio.LivroRepo;
import com.testenosqlspring.testenosql.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicoImpl implements Servico {

    @Autowired
    private LivroRepo livroRepo;

    @Override
    public List<Livro> findAll() {
        return this.livroRepo.findAll();
    }

    @Override
    public void save(Livro livro) {
        livroRepo.save(livro);
    }
}
