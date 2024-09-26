package dispositivo;



import componentes.aparelhoTelefonico;
import componentes.navegadorInternet;
import componentes.reprodutorMusical;

public class iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    public void ligar() {
        System.out.println("Fazendo ligação...");
    }

    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

    /**
     * 
     */
    public void iniciarCorreioVoz() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
}