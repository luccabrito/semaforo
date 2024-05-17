package c6.com.example.semaforo.interactors;

import c6.com.example.semaforo.entities.Cor;
import c6.com.example.semaforo.entities.Semaforo;
import org.springframework.stereotype.Service;

@Service
public class InstanciarSemaforoSempreVerdeUseCase {

    public void instanciarSemaforoSempreVerde() {
        Semaforo semaforo = new Semaforo();
        semaforo.setCorAtual(Cor.VERDE);
    }
}
