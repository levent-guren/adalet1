package tr.gov.uyap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import tr.gov.uyap.bean.Araba;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class IllkprojeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IllkprojeApplication.class, args);
		System.out.println("Contexti aldik");
		Araba araba = (Araba) context.getBean("araba");
		System.out.println(araba);
		Araba araba2 = (Araba) context.getBean("araba");
		System.out.println(araba2);
		System.out.println(araba == araba2);
		Araba araba3 = new Araba();
		System.out.println(araba == araba3);
		System.out.println(context.getBean("araba2"));
	}

}
