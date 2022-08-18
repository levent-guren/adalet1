package tr.gov.uyap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Kullanici {
	@Id
	private String username;
	private String password;
	private String roller;
}
