public class Main {
    public static void main(String[] args) {
        int numSpogliatoi = 2;
        int numArmadietti = 5;
        int numClienti = 6;

        Piscina piscina = new Piscina(numSpogliatoi, numArmadietti);
        for (int i = 0; i < numClienti; i++) {
            int idSpogliatoio = i % numSpogliatoi;
            int idArmadietto = i % numArmadietti;
            Cliente cliente = new Cliente(piscina, i, idSpogliatoio, idArmadietto);
            Thread thread = new Thread(cliente);
            thread.start();
        }
    }
}