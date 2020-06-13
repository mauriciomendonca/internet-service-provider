package models;

public class CaixaPostal {
    protected String nomeDono;
    protected Email[] caixaSaida;
    protected Email[] caixaEntrada;
    protected int totalEmailsCaixaSaida;
    protected int totalEmailsCaixaEntrada;

    public CaixaPostal(String nomeDono, int totalEmailsCaixaSaida, int totalEmailsCaixaEntrada) {
        this.nomeDono = nomeDono;
        this.totalEmailsCaixaSaida = totalEmailsCaixaSaida;
        this.totalEmailsCaixaEntrada = totalEmailsCaixaEntrada;
    }

    public boolean send(Email email) {
        return true; //Em construção
    }
}