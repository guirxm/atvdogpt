package com.example.Bibliotecazinha.service;

import com.example.Bibliotecazinha.DTO.ClienteDTO;
import com.example.Bibliotecazinha.entity.Cliente;
import com.example.Bibliotecazinha.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;

    public Cliente salvar(ClienteDTO dto) {
        Cliente c = new Cliente();
        c.setNome(dto.getNome());
        c.setSobrenome(dto.getSobrenome());
        c.setCpf(dto.getCpf());
        return repo.save(c);
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public void remover(Long id) {
        repo.deleteById(id);
    }

    public Cliente atualizar(Long id, ClienteDTO dto) {
        Cliente cliente = repo.findById(id).orElseThrow();
        cliente.setNome(dto.getNome());
        cliente.setSobrenome(dto.getSobrenome());
        cliente.setCpf(dto.getCpf());
        return repo.save(cliente);
    }
}

