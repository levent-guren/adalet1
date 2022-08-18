package tr.gov.uyap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.gov.uyap.dao.PersonelDAO;
import tr.gov.uyap.entity.Personel;

@Service
public class PersonelService {
	@Autowired
	private PersonelDAO personelDAO;

	public List<Personel> getPersoneller() {
		return personelDAO.getTumPersoneller();
	}

	public Personel guncelle(Personel personel) {
		return personelDAO.guncelle(personel);
	}
}
