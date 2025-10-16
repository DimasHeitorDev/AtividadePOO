import java.time.LocalDate;

public class ClientePF extends Cliente {
    private String cpf;
    private LocalDate dataNascimento;

    public ClientePF(String nome, String email, String telefone, String cpf, String id) {
        super(nome, email, telefone, id);

        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public String getIdentificadorUnico() {
        return this.cpf;
    }
}
