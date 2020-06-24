package models;

public class CaixaPostal {
    protected String nomeDono;
    protected Email[] caixaSaida;
    protected Email[] caixaEntrada;
    protected int totalEmailsCaixaSaida;
    protected int totalEmailsCaixaEntrada;
    protected int indexCaixaSaida = 0;

    public CaixaPostal(String nomeDono, int totalEmailsCaixaSaida, int totalEmailsCaixaEntrada) {
        this.nomeDono = nomeDono;
        this.totalEmailsCaixaSaida = totalEmailsCaixaSaida;
        this.totalEmailsCaixaEntrada = totalEmailsCaixaEntrada;
        this.caixaSaida = new Email[this.totalEmailsCaixaSaida];
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
        int i = 0;
        if (i < caixaEntrada.length) {
            caixaEntrada[i] = email;
            System.out.println("Email enviado para a caixa de entrada com sucesso!");
            return true;
        } else
            return false;
    }

    public String showInbox() {
        String formatString = "";
        for (Email e : caixaSaida) {
            if (e != null)
                formatString += "Caixa de entrada: [Remetente: " + e.getRemetente() + " Assunto: " + e.getAssunto() + " Corpo: " + e.getCorpoDoEmail() + "]\n";
        }
        return formatString;
    }
}