package tr.gov.uyap.ornek8;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("arabam")
@Order(1)
public class Toyota extends Araba {
	public Toyota() {
		setMarka("Toyota");
	}
}
