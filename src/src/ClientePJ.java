public class ClientePJ extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String nome, String email, String telefone, String cnpj, String id) {
        super(nome, email, telefone, id);

        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return this.cnpj;
    }

    public String getIdentificadorUnico() {
        return this.cnpj;
    }
}
