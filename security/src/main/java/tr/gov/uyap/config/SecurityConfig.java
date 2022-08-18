package tr.gov.uyap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService detailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(detailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.headers().frameOptions().disable();
		http.cors().and().csrf().disable().authorizeHttpRequests()
		    .antMatchers("/personeller").hasRole("admin")
		    .antMatchers("/login", "/logout").permitAll()
		    .antMatchers("/h2-console/**").permitAll()
		    .anyRequest().authenticated()
		    .and().formLogin()
		    //.loginPage("/login.jsp").loginProcessingUrl("/login")
//		    .defaultSuccessUrl("/menu.jsp")
//		    .failureForwardUrl("/error.jsp")
		    ;
		// @formatter:on
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public void run(String... args) throws Exception {
		System.out.println(getPasswordEncoder().encode("123"));
		System.out.println(getPasswordEncoder().encode("abc"));
	}
}
