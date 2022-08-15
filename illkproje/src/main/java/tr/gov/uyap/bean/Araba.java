package tr.gov.uyap.bean;

import lombok.Data;

@Data
public class Araba {
	private String marka;
	private int yas;

	public Araba() {
		System.out.println("Araba sınıfı oluşturuluyor.");
	}
}
