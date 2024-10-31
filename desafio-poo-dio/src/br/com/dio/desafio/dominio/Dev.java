package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConlcuidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    publlic void calcularTotalXp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConlcuidos() {
        return conteudosConlcuidos;
    }

    public void setConteudosConlcuidos(Set<Conteudo> conteudosConlcuidos) {
        this.conteudosConlcuidos = conteudosConlcuidos;
    }
}

