package tr.gov.uyap.ornek6;

import org.springframework.stereotype.Component;

@Component("arabam")
// bu sınıf arabam ismiyle spring'e tanıtılıyor.
// kullanılmak istenen yerde @Qualifier ile burada verilen ismin
// verilmesi gerekiyor.
// Aynı tipte birden fazla sınıf olduğunda istenen sınıfın başına
// @Primary yazılarak hangisinin kullanılacağını da belirleyebiliyoruz.
public class Toyota extends Araba {
	public Toyota() {
		setMarka("Toyota");
	}
}
