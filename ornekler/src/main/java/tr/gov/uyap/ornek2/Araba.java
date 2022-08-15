package tr.gov.uyap.ornek2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Araba {
	private String marka;
	private Motor motor;
}
