# Sinalização entre Threads

1.  Implemente o problema do produtor-consumidor que há buffer compartilhado entre threads. Há uma única thread
produtora e uma única consumidora. O buffer é preenchido em tempos aleatórios pela thread produtora. Assim que for
produzido algo, a thread consumidora deve ser comunicada para obter o valor. Se buffer cheio, o produtor deve esperar
sinalização da thread consumidora.
