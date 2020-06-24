package models;

public class Email {
    protected String remetente;
    protected String[] destinatarios;
    protected String assunto;
    protected String corpoDoEmail;

    public Email(String[] destinatarios, String assunto, String corpoDoEmail) {
        this.destinatarios = destinatarios;
        this.assunto = assunto;
        this.corpoDoEmail = corpoDoEmail;
    }

    public Email(String remetente, String[] destinatarios, String assunto, String corpoDoEmail) {
        this.remetente = remetente;
        this.destinatarios = destinatarios;
        this.assunto = assunto;
        this.corpoDoEmail = corpoDoEmail;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String[] getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatario(String[] destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpoDoEmail() {
        return corpoDoEmail;
    }

    public void setCorpoDoEmail(String corpoDoEmail) {
        this.corpoDoEmail = corpoDoEmail;
    }
}