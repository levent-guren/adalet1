package tr.gov.uyap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v4")
public class MerhabaController4 {
	@GetMapping("/merhaba")
	public String merhaba(@RequestParam(value = "isim", required = true) String adi, String soyadi) {
		return "Merhaba4 " + adi + ", " + soyadi;
	}
}
