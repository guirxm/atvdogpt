package com.example.Bibliotecazinha.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {
    private Long id;
    private String nome;
    private String autor;
    private String isbn;
    private String genero;
}
