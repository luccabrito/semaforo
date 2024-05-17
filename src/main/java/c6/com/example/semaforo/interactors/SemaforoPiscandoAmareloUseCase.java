package c6.com.example.semaforo.interactors;

import c6.com.example.semaforo.entities.Cor;
import c6.com.example.semaforo.entities.Semaforo;
import lombok.SneakyThrows;

public class SemaforoPiscandoAmareloUseCase {

    @SneakyThrows
    public void executar() {
        Semaforo semaforo = new Semaforo();
        Thread thread = new Thread();
        while (!semaforo.isEnergiaLigada()) {
            semaforo.setCorAtual(Cor.AMARELO);
            thread.wait(1000);
            semaforo.setCorAtual(Cor.DESLIGADO);
            thread.wait(1000);
        }
    }

}
