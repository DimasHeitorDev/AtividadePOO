import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento metodoPagamento;
    private StatusPedido statusPedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.data = LocalDate.now();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        for (ItemPedido ip: this.itens) {
            if (ip.getProduto().id.equals(produto.id))
            {
                ip.adicionarQuantidade(quantidade);
                return;
            }
        }

        itens.add(new ItemPedido(produto, quantidade));
    }

    public void removerItem(ItemPedido ip) {
        itens.remove(ip);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido ip: this.itens)
            total += ip.getSubtotal();
        return total;
    }

    public double aplicarDesconto(double desconto) {
        return calcularTotal() * (1 - desconto);
    }

    public boolean confirmarPedido() {
        if (this.statusPedido != StatusPedido.PENDENTE)
                return false;
        if (this.metodoPagamento != null)
                return false;

        boolean resultado = metodoPagamento.processarPagamento(this.calcularTotal());
        if (resultado)
                this.statusPedido = StatusPedido.PROCESSANDO;
        else
            this.statusPedido = StatusPedido.PENDENTE;

        return resultado;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }
}
