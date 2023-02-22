package com.running.buddybydaylight.security;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {
    // Creates a bean for the security filter chain
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // Disables CSRF protection and configures request authorization
        http
                .csrf()
                .disable()
                .authorizeHttpRequests()
                // Allows access to specific URLs for all users
                .requestMatchers("/assets/**","/static/**","/creatorBuilds","index","/killers","killer_form","/survivors",
                        "/survivor_form","/shrine","/users","/user_form","/", "/static/assets/css/**", "/static/assets/css/js/**","/webjars/**","/index"
                        , "../css/**","../js/**","/images/**")
                .permitAll()
                // Allows access to any other URL for all users
                .anyRequest()
                .permitAll();

        // Builds the security filter chain
        return http.build();
    }

}
