package com.example.booking.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private CustomUserDetailService userDetailService;
    @Autowired
    public WebSecurityConfig(CustomUserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/auth/login").permitAll()
                .antMatchers("/auth/register").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/index/{id}").permitAll()
                .antMatchers("/cabinet").permitAll()
                .antMatchers("/cabinet/{number_of_cab}").permitAll()
                .antMatchers("/cabinet/quadrature/{quadrature}").permitAll()
                .antMatchers("/cabinet/create").permitAll()
                .antMatchers("/cabinet/update/{id}").permitAll()
                .antMatchers("/cabinet/{id}/delete").permitAll()
                .antMatchers("/booking").permitAll()
                .antMatchers("/booking/peoples/{peoplenumber}").permitAll()
                .antMatchers("/booking/{cabinet}/{user}").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
    }

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