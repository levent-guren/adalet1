package tr.gov.uyap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.uyap.bean.Kisi;

@RestController
@RequestMapping("/v5")
public class MerhabaController5 {
	@GetMapping("/merhaba")
	public String merhaba(Kisi kisi) {
		return "Merhaba5 " + kisi.getAdi() + ", " + kisi.getSoyadi();
	}
}
