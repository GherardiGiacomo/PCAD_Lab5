import java.util.concurrent.Semaphore;

public class Piscina {
    private final Semaphore spogliatoi;
    private final Semaphore armadietti;

    public Piscina(int nS, int nC) {
        spogliatoi = new Semaphore(nS);
        armadietti = new Semaphore(nC);
    }

    public void entra() {
        try {
            spogliatoi.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void prendeArmadietto() {
        try {
            armadietti.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scambiaArmadietto() {
        try {
            armadietti.release();
            spogliatoi.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void esce() {
        try {
            spogliatoi.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}