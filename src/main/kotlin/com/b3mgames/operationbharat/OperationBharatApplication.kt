package com.b3mgames.operationbharat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class OperationbharatApplication : SpringBootServletInitializer()

fun main(args: Array<String>) {
    runApplication<OperationbharatApplication>(*args)
}