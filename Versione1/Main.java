public class Main {
    public static void main(String[] args) {
        Piscina piscina = new Piscina(3, 3);
        for (int i = 0; i < 5; i++) {
            new Cliente(piscina, i, i % 2, i % 3).start();
        }
    }
}

