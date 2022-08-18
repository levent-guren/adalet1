package tr.gov.uyap;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class Ornek2 {
	// @Async
	// @Scheduled(fixedRate = 1000)
	// her 1000 ms de bit metodu çağırır.
	public void deneme2() {
		System.out.println("Deneme metoduna girdi. 2 saniye beklemeye başlıyor.");
		bekle(5000);
		System.out.println("Merhaba");
	}

	@Scheduled(cron = "0 15 10 15 * ?")
	public void deneme3() {
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
