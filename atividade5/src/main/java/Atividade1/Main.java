package Atividade1;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread produtorThread = new Thread(new Produtor(buffer), "Produtor");
        Thread consumidorThread = new Thread(new Consumidor(buffer), "Consumidor");

        produtorThread.start();
        consumidorThread.start();

        try {
            produtorThread.join();
            consumidorThread.join();
        } catch (InterruptedException e) {
            System.out.println("Execução principal interrompida.");
        }
    }
}
