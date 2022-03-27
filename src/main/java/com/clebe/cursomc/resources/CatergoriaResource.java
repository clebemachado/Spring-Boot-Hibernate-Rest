package com.clebe.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CatergoriaResource {

//    private Integer id;
//    private String nome;

    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
     return "Rest está funcionando";
    }

}
