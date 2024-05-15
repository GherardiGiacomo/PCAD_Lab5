public class Cliente extends Thread {
    private final Piscina piscina;

    public Cliente(Piscina piscina) {
        this.piscina = piscina;
    }

    @Override
    public void run() {
        piscina.entra();
        System.out.println("Cliente entra");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        piscina.prendeArmadietto();
        System.out.println("Cliente prende armadietto");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        piscina.scambiaArmadietto();
        System.out.println("Cliente scambia armadietto");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        piscina.esce();
        System.out.println("Cliente esce");
    }
}