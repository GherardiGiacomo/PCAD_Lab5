import java.util.concurrent.Semaphore;

public class Piscina {
    private final Semaphore spogliatoi;
    private final Semaphore armadietti;

    public Piscina(int nS, int nC) {
        spogliatoi = new Semaphore(nS);
        armadietti = new Semaphore(nC);
    }

    public boolean PrendeChiaveSpogliatoio() throws InterruptedException {
        try {
            spogliatoi.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void TempoRandom() {
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean PrendeChiaveArmadietto() throws InterruptedException {
        try {
            armadietti.acquire();
        
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;

    }


    public boolean LasciaChiaveSpogliatoio() throws InterruptedException{
        try {
            spogliatoi.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }

    public boolean LasciaChiaveArmadietto()throws InterruptedException {
        try {
            armadietti.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}