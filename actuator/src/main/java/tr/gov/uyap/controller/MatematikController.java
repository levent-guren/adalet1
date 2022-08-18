package tr.gov.uyap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatematikController {
	@GetMapping("/topla")

	public int toplama(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	@GetMapping("/cikar")
	public int cikarma(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
}
