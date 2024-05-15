public class Main {
    public static void main(String[] args) {
        Piscina piscina = new Piscina(2, 3);
        for (int i = 0; i < 10; i++) {
            new Cliente(piscina).start();
        }
    }
}