package tr.gov.uyap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.gov.uyap.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Long> {

	public List<Personel> findByAdi(String adi);

	public List<Personel> findByBolumAdi(String bolumAdi);

	@Query(value = "from Personel p where p.bolum.adi = ?1")
	public List<Personel> personelleriGetir(String bolumAdi);

	@Query(value = "select * from personel where adi = ?1", nativeQuery = true)
	public List<Personel> personelleriGetir2(String personelAdi);
}
