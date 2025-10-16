public class Main {
    public static void main(String[] args) {
        Cliente c1 = new ClientePF("Carlos", "carlinhos@gmail.com", "62999999999", "123.456.789-00", "15");
        Cliente c2 = new ClientePJ("Carla", "carlaa@gmail.com", "62988888888", "987.654.321-00", "21");

        System.out.println(c1.getIdentificadorUnico());
    }
}