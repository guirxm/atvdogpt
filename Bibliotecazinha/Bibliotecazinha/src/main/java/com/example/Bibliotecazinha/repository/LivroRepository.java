package com.example.Bibliotecazinha.repository;

import com.example.Bibliotecazinha.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByGenero(String genero);
}
