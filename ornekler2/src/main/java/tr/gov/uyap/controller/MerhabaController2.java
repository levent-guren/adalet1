package tr.gov.uyap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/v2")
public class MerhabaController2 {
	@GetMapping("/merhaba")
	public String merhaba() {
		System.out.println("MerhabaController2.merhaba çağırıldı");
		return "Merhaba";
	}
}
