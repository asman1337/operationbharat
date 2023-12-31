package com.b3mgames.operationbharat

/*
 * The OperationbharatApplication class is the entry point of the Spring Boot application.
 * It is annotated with @SpringBootApplication to enable Spring Boot features and configuration.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EntityScan("com.b3mgames.operationbharat.backend.model")
@ComponentScan(basePackages = ["com.b3mgames.operationbharat"])
class OperationbharatApplication : SpringBootServletInitializer()

// The main function to run the Spring Boot application
fun main(args: Array<String>) {
    runApplication<OperationbharatApplication>(*args)
}