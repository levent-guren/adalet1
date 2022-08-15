package tr.gov.uyap.ornek4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrneklerApplication {
	@Bean
	static Araba arabaOlustur() {
		Araba araba = new Araba();
		araba.setMarka("BMW");
		araba.setYas(7);
		return araba;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrneklerApplication.class, args);
		// System.out.println(context.getBean("araba"));
		System.out.println(context.getBean("arabaOlustur"));
	}

}
