package tr.gov.uyap.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "bolum")
@EqualsAndHashCode(exclude = "bolum")
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 5)
	@Size(max = 5)
	private String adi;
	private String soyadi;
	@Column(precision = 10, scale = 2)
	private BigDecimal maas;
	@ManyToOne
	// @JoinColumn(name="bolum_id")
	private Bolum bolum;
}
