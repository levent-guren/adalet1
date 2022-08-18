package tr.gov.uyap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// @formatter:off
		auth.inMemoryAuthentication()
		     .withUser("levent").password("123").roles("admin", "user")
		     .and().withUser("asli").password("abc").roles("user");
		// @formatter:on
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.cors().and().csrf().disable().authorizeHttpRequests()
		    .antMatchers("/personeller").hasRole("admin")
		    .antMatchers("/login", "/logout").permitAll()
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
		return NoOpPasswordEncoder.getInstance();
	}
}
