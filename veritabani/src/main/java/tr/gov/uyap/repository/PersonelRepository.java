package tr.gov.uyap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.gov.uyap.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Long> {

}
