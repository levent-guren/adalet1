package tr.gov.uyap.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.gov.uyap.entity.Kullanici;
import tr.gov.uyap.repository.KullaniciRepository;

@Component
public class KullaniciDAO {
	@Autowired
	private KullaniciRepository kullaniciRepository;

	public Optional<Kullanici> getKullanici(String username) {
		return kullaniciRepository.findById(username);
	}
}
