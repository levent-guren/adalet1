package tr.gov.uyap.ornek7;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrneklerApplication implements CommandLineRunner {
	@Autowired
	private Araba[] arabalar;

	public static void main(String[] args) {
		SpringApplication.run(OrneklerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of(arabalar).forEach(this::deneme);
	}

	public void deneme(Araba araba) {
		System.out.println("Araba markası:" + araba.getMarka());
	}

}
