package c6.com.example.semaforo;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemaforoApplication {

	@SneakyThrows
	public static void main(String[] args) {
		SpringApplication.run(SemaforoApplication.class, args);
	}

}
