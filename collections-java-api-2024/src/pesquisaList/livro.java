package pesquisaList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class livro {
    private String titulo;

    private String autor;
    
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
    
        this.autor = autor;
    
        this.anoPublicacao = anoPublicacao;
    }
    
    
    
        /**
         * @return String return the titulo
         */
        public String getTitulo() {
            return titulo;
        }
    
        /**
         * @param titulo the titulo to set
         */
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        /**
         * @return String return the autor
         */
        public String getAutor() {
            return autor;
        }
    
        /**
         * @param autor the autor to set
         */
        public void setAutor(String autor) {
            this.autor = autor;
        }
    
        /**
         * @return int return the anoPublicacao
         */
        public int getAnoPublicacao() {
            return anoPublicacao;
        }
    
        /**
         * @param anoPublicacao the anoPublicacao to set
         */
        public void setAnoPublicacao(int anoPublicacao) {
            this.anoPublicacao = anoPublicacao;
        }

}
