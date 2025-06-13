package com.github.valentina810.localizationservice.controller

import com.github.valentina810.localizationservice.config.CacheName.SCREEN_CACHE
import com.github.valentina810.localizationservice.model.Screen
import com.github.valentina810.localizationservice.service.LocalizationService
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/localization")
class LocalizationController(private val localizationService: LocalizationService) {

    @Cacheable(SCREEN_CACHE)
    @GetMapping("/{locale}/{screen}")
    fun getScreenByLocale(@PathVariable locale: String, @PathVariable screen: String) =
        localizationService.getScreenByLocale(locale, screen) ?: Screen(screen = "", elements = emptyMap()) //#todo
}