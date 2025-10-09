public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String id;
    protected String telefone;

    public Cliente(String nome, String email, String telefone, String id) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public abstract String getIdentificadorUnico();
}
