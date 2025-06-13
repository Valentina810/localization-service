package com.github.valentina810.localizationservice.service.impl

import com.github.valentina810.localizationservice.config.CacheName.SCREEN_CACHE
import com.github.valentina810.localizationservice.repository.LocalizationRepository
import com.github.valentina810.localizationservice.service.LocalizationService
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class LocalizationServiceImpl(private val localizationRepository: LocalizationRepository) : LocalizationService {

    @Cacheable(
        value = [SCREEN_CACHE],
        key = "#locale + '_' + #screenName"
    )
    override fun getScreenByLocale(locale: String, screenName: String) =
        localizationRepository.findScreenByLocale(locale, screenName)
}