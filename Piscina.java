import java.util.concurrent.Semaphore;

public class Piscina {
    private final Semaphore spogliatoi;
    private final Semaphore armadietti;

    public Piscina(int nS, int nC) {
        spogliatoi = new Semaphore(nS);
        armadietti = new Semaphore(nC);
    }

    public void PrendeChiaveSpogliatoio() throws InterruptedException {
        try {
            spogliatoi.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void TempoRandom() {
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void PrendeChiaveArmadietto() throws InterruptedException {
        try {
            armadietti.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   /*  public void LasciaChiavi(int idArmadietto, int idSpogliatoio) {
        try {
            armadietti.release();
            spogliatoi.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } */

    public void LasciaChiaveSpogliatoio() throws InterruptedException{
        try {
            spogliatoi.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LasciaChiaveArmadietto()throws InterruptedException {
        try {
            armadietti.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}