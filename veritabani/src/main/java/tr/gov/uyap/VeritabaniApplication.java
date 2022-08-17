package tr.gov.uyap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeritabaniApplication implements CommandLineRunner {
	@Value("#{environment.path}")
	private String path;

	public static void main(String[] args) {
		SpringApplication.run(VeritabaniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(path);
	}

}
