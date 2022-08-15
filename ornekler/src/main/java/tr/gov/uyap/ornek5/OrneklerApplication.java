package tr.gov.uyap.ornek5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrneklerApplication implements CommandLineRunner {
	@Autowired
	private Araba araba;

	public static void main(String[] args) {
		SpringApplication.run(OrneklerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(araba);
	}

}
