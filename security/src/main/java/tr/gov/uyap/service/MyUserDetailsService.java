package tr.gov.uyap.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import tr.gov.uyap.entity.Kullanici;

@Component
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private KullaniciService kullaniciService;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Optional<Kullanici> kullaniciO = kullaniciService.getKullanici(username);
		Kullanici kullanici = kullaniciO.orElseThrow(
				() -> new UsernameNotFoundException("Kullanici adi / şifresi hatalidir"));
		List<GrantedAuthority> roller = new ArrayList<GrantedAuthority>();
		String[] rollerArr = kullanici.getRoller().split(",");
		Arrays.stream(rollerArr).forEach(role -> {
			GrantedAuthority auth = new SimpleGrantedAuthority("ROLE_" + role);
			roller.add(auth);
		});
		User user = new User(username, kullanici.getPassword(), roller);
		return user;
	}

}
