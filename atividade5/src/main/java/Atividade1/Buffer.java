package Atividade1;

public class Buffer {
    private Integer valor = null; // Buffer compartilhado

    public synchronized void produzir(int valor) throws InterruptedException {
        while (this.valor != null) {
            wait();
        }
        this.valor = valor;
        System.out.println("Produtor gerou: " + valor);
        notify();
    }

    public synchronized int consumir() throws InterruptedException {
        while (this.valor == null) {
            wait();
        }
        int valorConsumido = this.valor;
        this.valor = null;
        System.out.println("Consumidor consumiu: " + valorConsumido);
        notify();
        return valorConsumido;
    }
}
