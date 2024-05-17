package c6.com.example.semaforo.interactors;

import c6.com.example.semaforo.entities.Cor;
import c6.com.example.semaforo.entities.Semaforo;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class IniciarSemaforoPadraoUseCase {

    @SneakyThrows
    public void executar() {
        Thread thread = new Thread();
        Semaforo semaforo1 = new Semaforo(Cor.VERMELHO, 15, 15, 2, true);

        while (semaforo1.isEnergiaLigada()) {
            System.out.println(semaforo1.getCorAtual());
            thread.sleep(semaforo1.getTempoVermelho());
            semaforo1.setCorAtual(Cor.VERDE);
            System.out.println(semaforo1.getCorAtual());
            thread.sleep(semaforo1.getTempoVerde());
            semaforo1.setCorAtual(Cor.AMARELO);
            System.out.println(semaforo1.getCorAtual());
            thread.sleep(semaforo1.getTempoAmarelo());
        }
    }

}
