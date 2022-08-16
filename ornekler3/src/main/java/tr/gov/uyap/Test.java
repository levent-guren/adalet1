package tr.gov.uyap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tr.gov.uyap.bean.Kitap;

@Component
public class Test implements CommandLineRunner {
	@Autowired
	private Kitap kitap;
	@Value("${server.port:port_bilgisi_bulunamadi}")
	private String serverPort;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(kitap);
		System.out.println(serverPort);
	}
}
