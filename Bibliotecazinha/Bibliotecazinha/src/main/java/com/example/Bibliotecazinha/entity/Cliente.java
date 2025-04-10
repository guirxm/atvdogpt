package com.example.Bibliotecazinha.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String sobrenome;

    @Column(unique = true)
    private String cpf;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Emprestimo emprestimo;
}

