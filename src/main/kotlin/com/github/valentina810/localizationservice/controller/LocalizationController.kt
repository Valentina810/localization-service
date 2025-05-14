package com.github.valentina810.localizationservice.controller

import com.github.valentina810.localizationservice.service.LocalizationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/localization")
class LocalizationController(private val localizationService: LocalizationService) {

    @GetMapping("/{locale}/{screen}")
    fun getScreenByLocale(@PathVariable locale: String, @PathVariable screen: String): ResponseEntity<Any> {
        val screenByLocale = localizationService.getScreenByLocale(locale, screen)
        return if (screenByLocale != null) ResponseEntity.ok(screenByLocale)
        else ResponseEntity.notFound().build()
    }
}