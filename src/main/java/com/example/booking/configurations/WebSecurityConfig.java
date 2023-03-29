package com.example.booking.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{


    private CustomUserDetailService userDetailService;
    @Autowired
    public WebSecurityConfig(CustomUserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .requestMatchers("/auth/register", "/auth/login", "/index").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        return http.build();
    }

//    @Bean
//    public UserDetailsService users() {
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("qwerty123")
//                .roles("ADMIN")
//                .build();
//        UserDetails user = User.builder()
//                        .username("common")
//                        .password("common")
//                        .roles("CLIENT")
//                        .build();
//
//        return new InMemoryUserDetailsManager(admin, user);
//    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
