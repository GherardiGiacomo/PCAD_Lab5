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
            while (true) {

                if (piscina.PrendeChiaveSpogliatoio()) {
                    System.out.println("Cliente " + idCliente + " ha preso la chiave dello SPOGLIATOIO " + idSpogliatoio); //punto a

                    if (piscina.PrendeChiaveArmadietto()) {
                        System.out.println("Cliente " + idCliente + " ha preso la chiave dell'ARMADIETTO " + idArmadietto); //punto b

                        piscina.TempoRandom();
                        System.out.println("Cliente " + idCliente + " ha finito di cambiarsi");  //punti c d e 

                        piscina.LasciaChiaveSpogliatoio();
                        System.out.println("Il cliente " + idCliente + " ha lasciato la chiave dello SPOGLIATOIO " + idSpogliatoio); //punto f

                        piscina.TempoRandom();
                        System.out.println("Il cliente" + idCliente + " nuota");// punto g

                        piscina.PrendeChiaveSpogliatoio();
                        System.out.println("Cliente " + idCliente + " ha preso la chiave dello SPOGLIATOIO " + idSpogliatoio);//punto h

                        piscina.TempoRandom();
                        System.out.println("Cliente " + idCliente + " ha finito di rivestirsi"); // punti i j k

                        piscina.LasciaChiaveArmadietto(); //punto l
                        piscina.LasciaChiaveSpogliatoio(); //punto l

                        System.out.println("Cliente " + idCliente + " ha restituito la chiave dell'ARMADIETTO " + idArmadietto
                                + " e la chiave dello SPOGLIATOIO " + idSpogliatoio);
                        break;
                    } else {
                        piscina.LasciaChiaveSpogliatoio();
                        Thread.sleep(1000);
                    }
                } else {
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}