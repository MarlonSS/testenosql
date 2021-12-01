package com.testenosqlspring.testenosql.Repositorio;

import com.testenosqlspring.testenosql.model.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LivroRepo extends MongoRepository<Livro, String> {
}
