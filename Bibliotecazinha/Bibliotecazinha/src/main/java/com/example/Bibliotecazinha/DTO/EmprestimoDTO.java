package com.example.Bibliotecazinha.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmprestimoDTO {
    private Long id;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Long clienteId;
    private List<Long> livrosIds;
}
