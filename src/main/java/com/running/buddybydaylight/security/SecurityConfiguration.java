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



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeHttpRequests()
                .requestMatchers("/assets/**","/static/**","/creatorBuilds","index","/killers","killer_form","/survivors",
                        "/survivor_form","/shrine","/users","/user_form","/", "/static/assets/css/**", "/static/assets/css/js/**","/webjars/**","/index"
                , "../css/**","../js/**","/images/**")
                .permitAll()
                .anyRequest()
                .permitAll();

        return http.build();

    }
}
