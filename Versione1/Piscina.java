import java.util.concurrent.Semaphore;

public class Piscina {
    private final Semaphore spogliatoi;
    private final Semaphore armadietti;

    public Piscina(int nS, int nC) {
        spogliatoi = new Semaphore(nS);
        armadietti = new Semaphore(nC);
    }

    public void TempoRandom() {
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized boolean PrendeChiaveSpogliatoio() {
        while (true) {
            if (spogliatoi.tryAcquire()) {
                return true;
            } else {
                try {
                    System.out.println("\n\nchiave attualmente non disponibile");
                    Thread.sleep(1000); // aspetta per 1 secondo
                    System.out.println("\n\nIl cliente sta per provare a prendere la chiave");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
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