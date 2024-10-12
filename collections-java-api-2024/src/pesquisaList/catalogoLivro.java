package pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivro {
    private List<livro> livroList;

    public catalogoLivro() { this.livroList = new ArrayList<>();
    }

    public catalogoLivro(List<livro> livroList, livro pesquisarPorTitulo) {
        this.livroList = livroList;
        this.pesquisarPorTitulo = pesquisarPorTitulo;
    }

    public catalogoLivro(livro pesquisarPorTitulo) {
        this.pesquisarPorTitulo = pesquisarPorTitulo;
    }

    public void adicionarLivro( String tituloString, String autoString, int anoPublicacao){
        ((Object) livroList).adicionarLivro( new livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<livro> livrosPorAutor = new ArrayList<>();
        if(livroList.isEmpty()){
            for(livro l = livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    /**
     * @param anoInicial
     * @param anoFinal
     * @return
     */
    public list<livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livroPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        public livro pesquisarPorTitulo(String titulo){
            livro livroPorTitulo = null;
            if (!livroList.isEmpty()) {
                for (livro l : livroList) {
                    if(l.getTitulo).equalsIgnoreCase(titulo){
                        livroPorTitulo = l;
                        break;
                    }

                }
                return livroPorTitulo;
            } else {
                throw new RuntimeException(" A lista esta vazia" );
            }
            public static void main(String[]args){
//criando uma instancia do catalogo de livros
                catalogoLivro catalogoLivro = new catalogoLivro();

                catalogoLivro.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
                catalogoLivro.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
                catalogoLivro.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
                catalogoLivro.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);


                String autor;
                System.out.println(catalogoLivro.pesquisarPorAutor(autor));
            }





        }