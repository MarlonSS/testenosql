package com.testenosqlspring.testenosql.controller;


import com.testenosqlspring.testenosql.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.testenosqlspring.testenosql.serviço.Servico;
import java.util.List;


@RestController
@RequestMapping("/livro")
public class LivroController{

    @Autowired
    private Servico servico;

    @GetMapping("/listar")
    public List<Livro> obterTodos(){
        List<Livro> lista = servico.findAll();
        return lista;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<String> criar(@RequestBody  Livro livro) {
        if (livro != null) {
            servico.save(livro);
            return new ResponseEntity<>("Livro Salvo", HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>("Livro Vazio", HttpStatus.NOT_ACCEPTABLE);
        }
    }


}
