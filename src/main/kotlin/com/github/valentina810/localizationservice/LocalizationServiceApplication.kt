package com.github.valentina810.localizationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class LocalizationServiceApplication

fun main(args: Array<String>) {
	runApplication<LocalizationServiceApplication>(*args)
}
