package models;

public class Servidor {
    protected String nomeServidor;
    protected CaixaPostal[] caixasPostais;
    protected int totalCaixasPostais;

    public Servidor(String nomeServidor, CaixaPostal[] caixasPostais) {
        this.nomeServidor = nomeServidor;
        this.caixasPostais = caixasPostais;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public CaixaPostal[] getCaixasPostais() {
        return caixasPostais;
    }

    public void setCaixasPostais(CaixaPostal[] caixasPostais) {
        this.caixasPostais = caixasPostais;
    }

    public boolean adicionaCaixaPostal(CaixaPostal caixaPostal) {
        return true;
    }
}