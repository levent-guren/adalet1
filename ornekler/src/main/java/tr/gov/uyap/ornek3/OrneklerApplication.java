package tr.gov.uyap.ornek3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:tr/gov/uyap/ornek3/beans.xml")
public class OrneklerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrneklerApplication.class, args);
		System.out.println(context.getBean("araba"));
	}

}
