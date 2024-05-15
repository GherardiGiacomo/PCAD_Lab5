public class Cliente extends Thread {
    private final Piscina piscina;
    private final int idCliente;
    private final int idSpogliatoio;
    private final int idArmadietto;

    public Cliente(Piscina piscina, int idCliente, int idSpogliatoio, int idArmadietto) {
        this.piscina = piscina;
        this.idCliente = idCliente;
        this.idSpogliatoio = idSpogliatoio;
        this.idArmadietto = idArmadietto;
    }

    @Override
    public void run() {
        try {
            piscina.PrendeChiaveSpogliatoio();
            System.out.println("Cliente " + idCliente + " ha preso la chiave dello spogliatoio " + idSpogliatoio);
            
            piscina.PrendeChiaveArmadietto();
            System.out.println("Cliente " + idCliente + " ha preso la chiave dell'armadietto " + idArmadietto);
            
            piscina.TempoRandom();
            System.out.println("Cliente " + idCliente + " ha finito di cambiarsi");
            
            piscina.LasciaChiaveSpogliatoio();
            System.out.println("Il cliente " + idCliente + " ha lasciato la chiave dello spogliatoio " + idSpogliatoio);
            
            piscina.TempoRandom();
            System.out.println("Il cliente" + idCliente + " nuota");// nuota
            
            piscina.PrendeChiaveSpogliatoio();
            System.out.println("Cliente " + idCliente + " ha preso la chiave dello spogliatoio " + idSpogliatoio);
            
            piscina.TempoRandom();
            System.out.println("Cliente " + idCliente + " ha finito di cambiarsi"); // punti i j k
            
            piscina.LasciaChiaveArmadietto();
            piscina.LasciaChiaveSpogliatoio();
            System.out.println("Cliente " + idCliente + " ha restituito la chiave dell'armadietto " + idArmadietto
                    + " e la chiave dello spogliatoio " + idSpogliatoio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}