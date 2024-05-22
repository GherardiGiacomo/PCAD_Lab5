import java.util.concurrent.Semaphore;

public class Piscina {
    private final Semaphore spogliatoi;
    private final Semaphore armadietti;

    public Piscina(int nS, int nC) {
        spogliatoi = new Semaphore(nS);
        armadietti = new Semaphore(nC);
    }

    public synchronized boolean PrendeChiaveSpogliatoio() {
        if (spogliatoi.availablePermits() > 0) {
            try {
                spogliatoi.acquire();
                return true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void TempoRandom() {
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized boolean PrendeChiaveArmadietto() throws InterruptedException {
        try {
            armadietti.acquire();
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;

    }


    public synchronized void LasciaChiaveSpogliatoio() throws InterruptedException{
        try {
            spogliatoi.release();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }

    public synchronized void LasciaChiaveArmadietto()throws InterruptedException {
        try {
            armadietti.release();
        } catch (Exception e) {
            e.printStackTrace();
        }    }
}