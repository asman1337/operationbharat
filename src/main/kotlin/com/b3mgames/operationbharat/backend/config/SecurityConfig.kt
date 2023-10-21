package com.b3mgames.operationbharat.backend.config

/*
 * The SecurityConfig class defines the security configuration for the Spring Boot application.
 * It configures security filters, disables CSRF and HTTP Basic authentication.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableMethodSecurity // Enable method-level security
class SecurityConfig {
    // Configures the security filter chain
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        return with(http) {
            csrf { cs -> cs.disable() } // Disables CSRF protection
            httpBasic { basic -> basic.disable() } // Disables HTTP Basic authentication
        }.build()
    }

    // Customizes web security configuration
    @Bean
    fun webSecurityCustomizer(): WebSecurityCustomizer {
        return WebSecurityCustomizer { web: WebSecurity ->
            web.ignoring().anyRequest() // Ignores security for any request
        }
    }
}
