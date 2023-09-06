package com.francalino.frankley.springsecurehelloworld.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration	
@EnableWebSecurity	
class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
			.csrf()
				.disable()
			.authorizeHttpRequests()
				.anyRequest()
					.authenticated();
		
		http
			.oauth2ResourceServer()
			.jwt();

        http.sessionManagement(management -> management
        	.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );
		
		return http.build();
				 		
	}
	
}