package tr.gov.uyap.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.gov.uyap.entity.Personel;
import tr.gov.uyap.repository.PersonelRepository;

@Component
public class PersonelDAO {
	@Autowired
	private PersonelRepository personelRepository;

	public List<Personel> getTumPersoneller() {
		return personelRepository.findAll();
	}

	public Personel guncelle(Personel personel) {
		return personelRepository.save(personel);
	}
}
