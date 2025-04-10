package com.example.Bibliotecazinha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String autor;

    @Column(unique = true)
    private String isbn;

    private String genero;

    @ManyToMany(mappedBy = "livros")
    private List<Emprestimo> emprestimos;
}
