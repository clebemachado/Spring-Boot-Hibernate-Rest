package com.clebe.cursomc.services;

import com.clebe.cursomc.domain.Categoria;
import com.clebe.cursomc.repositories.CategoriaRepository;
import com.clebe.cursomc.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado Id: " + id
                + "Tipo: " + Categoria.class.getName()
                ));
    }
}
