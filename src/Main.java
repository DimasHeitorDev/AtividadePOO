public class Main {
    public static void main(String[] args) {
        Cliente c1 = new ClientePF("Carlos", "carlinhos@gmail.com", "62999999999", "123.456.789-00", "15");

        Produto produto1 = new Produto("Teclado", 119.99, "Teclado gamer RGB 100%", 15, "12");
        Produto produto2 = new Produto("Mouse", 79.99, "Mouse gamer", 21, "37");

        Pedido p1 = new Pedido(c1);

        p1.adicionarItem(produto1, 2);
        p1.adicionarItem(produto2, 3);

        for (ItemPedido ip: p1.getItens())
            System.out.println(ip.getProduto().nome + " " + ip.getQuantidade());
        System.out.println("--------------");

        p1.adicionarItem(produto1, 5);

        for (ItemPedido ip: p1.getItens())
            System.out.println(ip.getProduto().nome + " " + ip.getQuantidade());
        System.out.println("--------------");
    }
}