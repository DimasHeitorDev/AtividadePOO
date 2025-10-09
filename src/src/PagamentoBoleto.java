import java.time.LocalDate;

public class PagamentoBoleto {
    private String codigoBarras;
    private LocalDate dataVencimento;
    private double valor;
    private StatusPagamento statusPagamento;

    public boolean processarPagamento(double valor) {
        this.statusPagamento = StatusPagamento.APROVADO;
        return true;
    }

    public StatusPagamento getStatus() {
        return this.statusPagamento;
    }
}
