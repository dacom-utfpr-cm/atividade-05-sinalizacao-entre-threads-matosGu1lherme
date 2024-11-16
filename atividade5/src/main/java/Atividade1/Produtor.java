package Atividade1;
import java.util.Random;

public class Produtor implements Runnable {
    private final Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                int valor = random.nextInt(100) + 1;
                buffer.produzir(valor);
                Thread.sleep(random.nextInt(2000) + 500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Produtor interrompido.");
        }
    }
}
