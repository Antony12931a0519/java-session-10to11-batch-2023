package com.javasession.bms.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Value("${security.user}")
	private String username;
	@Value("${security.password}")
	private String password;

	// Create 2 users for demo
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		System.out.println(username);
		System.out.println(password);

		auth.inMemoryAuthentication().withUser(username).password("{noop}"+password).roles("USER").and().withUser("admin")
				.password("{noop}password").roles("USER", "ADMIN");

	}

	// Secure the endpoins with HTTP Basic authentication
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
				// HTTP Basic authentication
				.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.GET, "/ems/**").hasRole("USER")
				.antMatchers(HttpMethod.POST, "/ems/**").hasRole("ADMIN").antMatchers(HttpMethod.PUT, "/ems/**")
				.hasRole("ADMIN").antMatchers(HttpMethod.PATCH, "/ems/**").hasRole("ADMIN")
				.antMatchers(HttpMethod.DELETE, "/ems/**").hasRole("ADMIN").and().csrf().disable().formLogin()
				.disable();
	}

}
