package tr.gov.uyap.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.gov.uyap.dao.KullaniciDAO;
import tr.gov.uyap.entity.Kullanici;

@Service
public class KullaniciService {
	@Autowired
	private KullaniciDAO kullaniciDAO;

	public Optional<Kullanici> getKullanici(String username) {
		return kullaniciDAO.getKullanici(username);
	}
}
