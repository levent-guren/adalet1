package tr.gov.uyap.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.uyap.dao.PersonelDAO;
import tr.gov.uyap.entity.Personel;
import tr.gov.uyap.model.PersonelModel;

@RestController
public class PersonelController {
	@Autowired
	private PersonelDAO personelDAO;
	@Autowired
	private ModelMapper mapper;

	@GetMapping
	public List<Personel> getPersoneller() {
		return personelDAO.getTumPersoneller();
	}

//	@GetMapping("/personeller")
//	public List<PersonelModel> getPersoneller2() {
//		List<Personel> personeller = personelDAO.getTumPersoneller();
//		List<PersonelModel> sonuc = new ArrayList<>();
//		for (Personel personel : personeller) {
//			PersonelModel model = new PersonelModel();
//			model.setAdi(personel.getAdi());
//			model.setSoyadi(personel.getSoyadi());
//			sonuc.add(model);
//		}
//		return sonuc;
//	}
	@GetMapping("/personeller")
	public List<PersonelModel> getPersoneller2() {
		List<Personel> personeller = personelDAO.getTumPersoneller();
		return personeller.stream().map(p -> mapper.map(p, PersonelModel.class))
				.collect(Collectors.toList());
	}

	@PostMapping("/guncelle")
	public Personel guncelle(@RequestBody Personel personel) {
		return personelDAO.guncelle(personel);
	}
}
