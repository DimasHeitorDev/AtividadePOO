import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento metodoPagamento;
    private StatusPedido statusPedido;

    public void adicionarItem(Produto produto, int quantidade) {
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
        return metodoPagamento.processarPagamento(calcularTotal());
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }
}
