package tr.gov.uyap.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "personeller")
@EqualsAndHashCode(exclude = "personeller")
public class Bolum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true, length = 30)
	private String adi;
	@OneToMany(mappedBy = "bolum")
	private Set<Personel> personeller;
}
