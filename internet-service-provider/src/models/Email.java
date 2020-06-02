package models;

public class Email {
    protected String remetente;
    protected String destinatario; //Precisa ser array de destinatarios
    protected String assunto;
    protected String corpoDoEmail;

    public void Email(String destinatario, String assunto, String corpoDoEmail) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpoDoEmail = corpoDoEmail;
    }

    public void Email(String remetente, String destinatario, String assunto, String corpoDoEmail) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpoDoEmail = corpoDoEmail;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
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