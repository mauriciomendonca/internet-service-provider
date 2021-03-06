package models;

import java.util.Arrays;

public class CaixaPostal {
    protected String nomeDono;
    protected Email[] caixaSaida;
    protected Email[] caixaEntrada;
    protected int totalEmailsCaixaSaida;
    protected int totalEmailsCaixaEntrada;
    protected int indexCaixaSaida = 0;
    protected int indexCaixaEntrada = 0;

    public CaixaPostal(String nomeDono, int totalEmailsCaixaSaida, int totalEmailsCaixaEntrada) {
        this.nomeDono = nomeDono;
        this.totalEmailsCaixaSaida = totalEmailsCaixaSaida;
        this.totalEmailsCaixaEntrada = totalEmailsCaixaEntrada;
        this.caixaSaida = new Email[this.totalEmailsCaixaSaida];
        this.caixaEntrada = new Email[this.totalEmailsCaixaEntrada];
    }

    public boolean send(Email email) {
        if (indexCaixaSaida < caixaSaida.length) {
            caixaSaida[indexCaixaSaida] = email;
            System.out.println("Email enviado para a caixa de saida com sucesso!");
            indexCaixaSaida++;
        }
        return true;
    }

    public boolean receive(Email email) {
        if (indexCaixaEntrada < caixaEntrada.length) {
            caixaEntrada[indexCaixaEntrada] = email;
            System.out.println("Email enviado para a caixa de entrada com sucesso!");
            indexCaixaSaida++;
        }
        return true;
    }

    public String showInbox() {
        String formatMessage = "";
        for (Email e : caixaEntrada) {
            if (e != null)
                formatMessage += "Caixa de entrada: Remetente: " + e.getRemetente() + " | Assunto: " + e.getAssunto() + " | Corpo: " + e.getCorpoDoEmail() + "\n";
        }
        return formatMessage;
    }

    public String showOutbox() {
        String formatMessage = "";
        for (Email e : caixaSaida) {
            String destinatarios = "";
            if (e != null) {
                destinatarios += Arrays.toString(e.getDestinatarios());
                formatMessage += "Caixa de saida: Destinatarios: " + destinatarios + " | Assunto: " + e.getAssunto() + " | Corpo: " + e.getCorpoDoEmail() + "\n";
            }
        }
        return formatMessage;
    }
}