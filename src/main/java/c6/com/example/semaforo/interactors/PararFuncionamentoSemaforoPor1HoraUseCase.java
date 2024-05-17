package c6.com.example.semaforo.interactors;

import c6.com.example.semaforo.entities.Cor;
import c6.com.example.semaforo.entities.Semaforo;
import lombok.SneakyThrows;

public class PararFuncionamentoSemaforoPor1HoraUseCase {

    @SneakyThrows
    public void executar(Semaforo semaforo) {
        Thread thread = new Thread();
        Cor cor = semaforo.getCorAtual();
        thread.wait(360000);
    }
}
