package tr.gov.uyap;

import org.springframework.stereotype.Component;

@Component
public class Ornek1 {
	// @Scheduled(fixedDelay = 1000)
	// metodun son çalışmasının bitiminden itibaren 1000 ms bekler.
	public void deneme() {
		System.out.println("Deneme metoduna girdi. 2 saniye beklemeye başlıyor.");
		bekle(2000);
		System.out.println("Merhaba");
	}

	// @Scheduled(fixedRate = 1000)
	// her 1000 ms de bit metodu çağırır. Metodun çalışma süresinden bağımsız
	// olarak.
	public void deneme2() {
		System.out.println("Deneme metoduna girdi. 2 saniye beklemeye başlıyor.");
		bekle(700);
		System.out.println("Merhaba");
	}

	private void bekle(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
