package models;

public class EmailComAnexo extends Email {
    protected String anexo;

    public EmailComAnexo(String[] destinatarios, String assunto, String corpoDoEmail, String anexo) {
        super(destinatarios, assunto, corpoDoEmail);
        this.anexo = anexo;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
}