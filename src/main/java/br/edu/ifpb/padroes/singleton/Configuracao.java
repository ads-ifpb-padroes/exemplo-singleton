package br.edu.ifpb.padroes.singleton;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class Configuracao {

    private String nomeUsuario;
    private String sobrenomeUsuario;
    private String iniciais;

    private static Configuracao configuracao;

    private Configuracao(String nomeUsuario, String sobrenomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    public static Configuracao getInstance(String nomeUsuario, String sobrenomeUsuario) {
        if(configuracao == null) {
            configuracao = new Configuracao(nomeUsuario, sobrenomeUsuario);
        }
        return configuracao;
    }

    private void gerarIniciais() {
        this.iniciais = "" + nomeUsuario.charAt(0) + sobrenomeUsuario.charAt(0);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }
}
