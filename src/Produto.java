public class Produto {
    protected String nome;
    protected double preco;
    protected int estoque;
    protected String id;
    protected String descricao;

    public Produto(String nome, double preco, String descricao, int estoque, String id) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public double getPreco() {
        return this.preco;
    }

    public void adicionarEstoque(int qtd) {
        this.estoque += qtd;
    }
}
