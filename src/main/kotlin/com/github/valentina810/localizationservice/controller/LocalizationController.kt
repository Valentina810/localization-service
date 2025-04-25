package com.github.valentina810.localizationservice.controller

import com.github.valentina810.localizationservice.service.impl.LocalizationServiceImpl
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/localization")
class LocalizationController(private val localizationServiceImpl: LocalizationServiceImpl) {

    @GetMapping("/{locale}/{screen}")
    fun getTranslation(@PathVariable locale: String, @PathVariable screen: String): ResponseEntity<Any> {
        val translation = localizationServiceImpl.getTranslation(screen, locale)
        return if (translation != null) ResponseEntity.ok(translation.content)
        else ResponseEntity.notFound().build()
    }
}