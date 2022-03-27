package com.clebe.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public Categoria(){}

    public Categoria(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return id.equals(categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
