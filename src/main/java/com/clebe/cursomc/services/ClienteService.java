package com.clebe.cursomc.services;

import com.clebe.cursomc.domain.Cliente;
import com.clebe.cursomc.repositories.ClienteRepository;
import com.clebe.cursomc.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(()->
                new ObjectNotFoundException("Cliente não encontado! Id: " +
                + id));
    }
}
