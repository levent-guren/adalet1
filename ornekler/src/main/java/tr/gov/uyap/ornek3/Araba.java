package tr.gov.uyap.ornek3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Araba {
	private String marka;
	private int yas;

	public static Araba arabaOlustur() {
		Araba araba = new Araba();
		araba.setMarka("BMW");
		araba.setYas(7);
		return araba;
	}
}
