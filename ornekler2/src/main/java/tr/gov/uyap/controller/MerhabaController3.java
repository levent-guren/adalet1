package tr.gov.uyap.controller;

import javax.servlet.ServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v3")
public class MerhabaController3 {
	@GetMapping("/merhaba")
	public String merhaba(ServletRequest request) {
		String adi = request.getParameter("adi");
		String soyadi = request.getParameter("soyadi");
		return "Merhaba " + adi + ", " + soyadi;
	}
}
