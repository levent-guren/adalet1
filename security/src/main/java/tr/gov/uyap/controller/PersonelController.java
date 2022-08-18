package tr.gov.uyap.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tr.gov.uyap.entity.Personel;
import tr.gov.uyap.model.PersonelModel;
import tr.gov.uyap.service.PersonelService;

@RestController
public class PersonelController {
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private PersonelService personelService;

	@GetMapping("/personeller")
	public List<PersonelModel> getPersoneller() {
		return personelService.getPersoneller().stream().map(this::personelCevir)
				.collect(Collectors.toList());
	}

	private PersonelModel personelCevir(Personel personel) {
		PersonelModel personelModel = mapper.map(personel, PersonelModel.class);
		if (personel.getBolum() != null) {
			personelModel.setBolumAdi(personel.getBolum().getAdi());
		}
		return personelModel;
	}

	@PostMapping("/guncelle")
	public PersonelModel personelGuncelle(@RequestBody Personel personel) {
		Personel personelDB = personelService.guncelle(personel);
		PersonelModel model = mapper.map(personelDB, PersonelModel.class);
		model.setBolumAdi(personelDB.getBolum().getAdi());
		return model;
	}
}
