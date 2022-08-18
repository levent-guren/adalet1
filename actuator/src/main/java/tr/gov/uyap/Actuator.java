package tr.gov.uyap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Actuator {

	public static void main(String[] args) {
		SpringApplication.run(Actuator.class, args);
	}

}
