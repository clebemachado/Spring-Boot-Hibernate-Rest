package com.clebe.cursomc.resources;

import com.clebe.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CatergoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria c1 = new Categoria(1, "Informatica");
        Categoria c2 = new Categoria(2, "Escritório");
        List<Categoria> categoriaList = new ArrayList<>();
        categoriaList.add(c1);
        categoriaList.add(c2);

     return categoriaList;
    }

}
