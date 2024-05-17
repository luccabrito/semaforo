package c6.com.example.semaforo.entities;

import lombok.*;
import org.springframework.web.bind.annotation.PathVariable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Semaforo {

    private Cor corAtual;
    private int tempoVermelho;
    private int tempoVerde;
    private int tempoAmarelo;
    private boolean isEnergiaLigada;

}
