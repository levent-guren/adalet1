package tr.gov.uyap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "", tags = { "matematik işlemleri" })
public class MatematikController {
	@GetMapping("/topla")
	@ApiOperation(value = "Toplama işlemini yapar", notes = "iki sayi üzerinde")

	public int toplama(
			@ApiParam(name = "sayi 1", type = "Integer", value = "ilk sayı", example = "5", required = true) int sayi1,
			@ApiParam(name = "sayı 2", type = "Integer", value = "ikinci sayı", example = "3", required = true) int sayi2) {
		return sayi1 + sayi2;
	}

	@GetMapping("/cikar")
	@ApiOperation(value = "Çıkarma işlemini yapar", notes = "iki sayi üzerinde")
	public int cikarma(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
}
