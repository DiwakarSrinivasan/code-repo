package com.example.productconfigapi;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
			.withUser("product")
			.password("product")
			.roles("user")
			.and()
			.withUser("config")
			.password("config")
			.roles("admin");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/api/getproductdetails")
			.hasRole("user")
			.antMatchers("/api/getconfigdetails")
			.hasRole("admin")
			.and()
			.formLogin();
			
		
	}
	
	@Bean
	public PasswordEncoder getBean() {
		
		return NoOpPasswordEncoder.getInstance();
	}

}
