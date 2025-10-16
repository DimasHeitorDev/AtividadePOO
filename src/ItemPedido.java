public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return this.produto.getPreco() * this.quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
