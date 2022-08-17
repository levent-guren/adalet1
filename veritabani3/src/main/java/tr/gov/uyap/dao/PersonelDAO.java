package tr.gov.uyap.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import tr.gov.uyap.entity.Personel;
import tr.gov.uyap.repository.PersonelRepository;

@Component
public class PersonelDAO implements CommandLineRunner {
	@Autowired
	private PersonelRepository personelRepository;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Personel> getTumPersoneller() {
		return personelRepository.findAll();
	}

	public Personel guncelle(Personel personel) {
		return personelRepository.save(personel);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bolum adına göre arama yapılıyor");
		personelRepository.findByBolumAdi("Bilgi İşlem").forEach(System.out::println);
	}
}
