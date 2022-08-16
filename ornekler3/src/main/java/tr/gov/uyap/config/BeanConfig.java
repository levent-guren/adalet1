package tr.gov.uyap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tr.gov.uyap.bean.Kitap;

@Configuration
public class BeanConfig {
	@Bean
	Kitap kitapConfig() {
		Kitap kitap = new Kitap();
		kitap.setAdi("M.S. 2150");
		return kitap;
	}
}
