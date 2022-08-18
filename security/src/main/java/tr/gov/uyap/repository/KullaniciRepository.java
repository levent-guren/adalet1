package tr.gov.uyap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.gov.uyap.entity.Kullanici;

public interface KullaniciRepository extends JpaRepository<Kullanici, String> {

}
