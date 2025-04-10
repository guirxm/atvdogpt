package com.example.Bibliotecazinha.repository;

import com.example.Bibliotecazinha.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
