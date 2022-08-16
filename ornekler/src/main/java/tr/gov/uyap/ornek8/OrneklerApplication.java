package tr.gov.uyap.ornek8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrneklerApplication implements CommandLineRunner {
	@Autowired
	private List<Araba> arabalar;

	public static void main(String[] args) {
		SpringApplication.run(OrneklerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		arabalar.stream().forEach(this::deneme);
	}

	public void deneme(Araba araba) {
		System.out.println("Araba markası:" + araba.getMarka());
	}

}
