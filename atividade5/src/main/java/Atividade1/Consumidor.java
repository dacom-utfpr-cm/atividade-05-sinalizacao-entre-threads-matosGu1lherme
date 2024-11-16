package Atividade1;

import java.util.Random;

public class Consumidor implements Runnable {
    private final Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                buffer.consumir();
                Thread.sleep(random.nextInt(2000) + 500); // Simula tempo de consumo
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumidor interrompido.");
        }
    }
}
